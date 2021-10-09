package com.dkafetzi.kata;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app", ignoreInvalidFields=true)
@Configuration
public class KataSettings {
	
	private List<String> testsList;
	
	public void setTestsList(List<String> testsList) {
		this.testsList = testsList;
	}

	public List<String> getTestsList() {
		return testsList;
	}
	
}