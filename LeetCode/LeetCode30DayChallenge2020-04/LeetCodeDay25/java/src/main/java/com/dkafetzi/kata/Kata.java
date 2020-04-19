package com.dkafetzi.kata;

import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.common.base.Charsets;

@SpringBootApplication
public class Kata implements CommandLineRunner {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Kata.class);

	@Autowired
	private KataSettings settings;
	
	private final Options options;
	{
		options = new Options();
		Option help = Option.builder("h")
				.longOpt("help")
				.desc("Show usage message")
				.build();
		
		Option testName = Option.builder("t")
				.desc("Test to execute")
				.longOpt("test-name")
				.required()
				.hasArg()
				.argName("testName")
				.build();
		
		Option testFile = Option.builder("f")
				.desc("Input file")
				.longOpt("input-file")
				.required()
				.hasArg()
				.argName("inputFile")
				.build();
		
		options.addOption(help);
		options.addOption(testName);
		options.addOption(testFile);
	}
	
	@Autowired
	private Solution solution;

    public static void main(String[] args) throws Exception {

    	SpringApplication app = new SpringApplication(Kata.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);	
    }

	private void printUsage() {
		HelpFormatter formatter = new HelpFormatter();
		
		StringBuilder tests = new StringBuilder();
		List<String> testsList = settings.getTestsList();
		for (int i = 0; i < testsList.size(); i++) {
			tests.append(testsList.get(i));
		}
		
		formatter.printHelp("Kata", null, options, tests.toString());
	}
	
    @Override
    public void run(String... args) throws Exception {
    	LOGGER.info("Launching...");
    	
		String testName = "";
		String inputFile = "";
		String input = "";
		CommandLineParser parser = new DefaultParser();
		CommandLine cmdLine = null;
		
		try {
			cmdLine = parser.parse(options, args, false);
		} catch (ParseException e) {
			System.err.println("Parsing cli failed. Reason: " + e.getMessage());
			printUsage();
			System.exit(1);
		}
		
		if (cmdLine.hasOption("h")) {
			printUsage();
			System.exit(0);
		}
		
		try {
			testName = cmdLine.getOptionValue("t");
			inputFile = cmdLine.getOptionValue("f");
		    input = IOUtils.toString(new FileInputStream(inputFile), Charsets.UTF_8.toString());
		} catch (Exception e) {
			System.err.println("Failed to read inputs. Reason: " + e.getMessage());
			printUsage();
			System.exit(1);
		} 
		
		// Do nothing for now.
    }
	
}