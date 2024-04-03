package com.dkafetzi.kata;

import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public int[] dailyTemperaturesOn2On(int[] temperatures) {
		if (temperatures == null || temperatures.length < 2)
			return new int[1];

		int[] result = new int[temperatures.length];

		for (int i = 0; i < temperatures.length - 1; i++) {
			for (int j = i + 1; j < temperatures.length; j++) {
				if (temperatures[j] > temperatures[i]) {
					result[i] = j-i;
					break;
				}
			}
		}
		result[temperatures.length - 1] = 0;
		return result;
	}

	public int[] dailyTemperaturesOn2O1(int[] temperatures) {
		if (temperatures == null || temperatures.length < 2)
			return new int[1];

		for (int i = 0; i < temperatures.length - 1; i++) {
			int currentTemperature = temperatures[i];
			temperatures[i] = 0;
			for (int j = i + 1; j < temperatures.length; j++) {
				if (temperatures[j] > currentTemperature) {
					temperatures[i] = j-i;
					break;
				}
			}
		}
		temperatures[temperatures.length - 1] = 0;
		return temperatures;
	}

	public int[] dailyTemperaturesOnO1(int[] temperatures) {
		if (temperatures == null || temperatures.length < 2)
			return new int[1];
		
		Stack<Integer> s = new Stack<Integer>();
		s.add(0);
		for (int i = 1; i < temperatures.length; i++) {
			
			int currentTemp = temperatures[i];
			while (!s.empty()) {
				int peek = s.peek();
				if (temperatures[peek] >= currentTemp)
					break;
				
				temperatures[peek] = i - peek;
				s.pop();
			}
			s.add(i);
		}
		while (!s.empty()) {
			temperatures[s.pop()] = 0;			
		}

		return temperatures;
	}
}
