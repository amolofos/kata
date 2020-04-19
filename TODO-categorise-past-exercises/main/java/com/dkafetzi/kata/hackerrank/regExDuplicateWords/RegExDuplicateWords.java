package com.dkafetzi.kata.hackerrank.regExDuplicateWords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDuplicateWords {

	/*
	 * https://www.hackerrank.com/challenges/duplicate-word/problem
	 */
    static String replaceAllButFirstOccurence(String input) {
    	StringBuilder output = new StringBuilder();
    	/*
    	 * The following regular expression is explained as per below.
    	 * 	(\b(\w+)\b)(\s(\b\1\b))+
    	 *  (\b(\w+)\b) : match a full word and assigned it to a group
    	 *  	\b is a word boundary
    	 *  	\w is A word character
    	 *  (\s(\b\1\b))+ : try to find one or more occurrences of the above word that start with a space character
    	 */
    	String regex = "(\\b(\\w+)\\b)(\\s(\\b\\1\\b))+";
        Pattern p = Pattern.compile(regex, java.util.regex.Pattern.CASE_INSENSITIVE);

        String[] lines = input.split("\\r?\\n");

        int numSentences = Integer.parseInt(lines[0]);
        
        while (numSentences-- > 0) {
            String line = lines[lines.length - numSentences - 1];
            
            Matcher m = p.matcher(line);
                       
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
            	line = line.replaceAll(m.group(0), m.group(1));
            }
            
            output.append(line + "\n");
        }
        
        // Let's remove last new line.
        output.setLength(output.length() - 1);
        
        return output.toString();
    }
}
