package com.dkafetzi.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public int firstMissingPositiveOnO1(int[] A) {
		int result = -1;
		
		int index = 0;
		while (index < A.length) {
			int currentValue = A[index];
			
			// -1 since 1 is located at zero.
			int indexValue = currentValue > 0 && currentValue <= A.length ? A[currentValue - 1] : 0;
			
			if (currentValue > 0 && currentValue <= A.length && currentValue != indexValue) {
				A[index] = indexValue;
				A[currentValue - 1] = currentValue;
				continue;
			}
			
			index++;
		}
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				result = i + 1;
				break;
			}
		}
		
		if (result == -1)
			result = A.length + 1;

		return result;
	}	
}
