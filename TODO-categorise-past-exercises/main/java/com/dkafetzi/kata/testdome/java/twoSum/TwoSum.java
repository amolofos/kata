/*
 * https://www.testdome.com/d/java-interview-questions/4
 * 
 * 4. Two Sum
 * 
 * Write a function that, when passed a list and a target sum,
 * returns two distinct zero-based indices of any two of the numbers,
 * whose sum is equal to the target sum. If there are no two numbers,
 * the function should return null.
 * 
 * For example, findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10) should
 * return a single dimensional array with two elements and contain any of
 * the following pairs of indices:
 *  0 and 3 (or 3 and 0) as 3 + 7 = 10
 *  1 and 5 (or 5 and 1) as 1 + 9 = 10
 *  2 and 4 (or 4 and 2) as 5 + 5 = 10
*/
package com.dkafetzi.kata.testdome.java.twoSum;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	
	public static int[] findTwoSum(int[] list, int sum) {
    	Integer x = null;
    	Integer y = null;
    	
    	boolean found = false;
    	for (int i = 0; i < list.length - 1 && !found; i++) {
    		for (int j = i + 1; j < list.length && !found; j++) {
    			if (list[i] == list[j]) {
    				continue;
    			}
    			int temp_sum = list[i] + list[j];
    			if (temp_sum == sum) {
    				x = i;
    				y = j;
    				
    				found = true;
    				break;
    			}
    		}
    	}
    	
    	return x == null ? null : new int[] {x.intValue(), y.intValue()};
    }
	
    public static int[] findTwoSum_with_ArrayList(int[] list, int sum) {
    	List<Integer> findings = new ArrayList<Integer>();
    	
    	for (int i = 0; i < list.length - 1; i++) {
    		for (int j = i + 1; j < list.length; j++) {
    			if (list[i] == list[j]) {
    				continue;
    			}
    			int temp_sum = list[i] + list[j];
    			if (temp_sum == sum) {
    				findings.add(i);
    				findings.add(j);
    				
    				break;
    			}
    		}
    	}
    	
    	if (findings.size() == 0) {
    		return null;
    	}
    	int[] arr = new int[2];
    	arr[0] = findings.get(0); 
    	arr[1] = findings.get(1);
    	
    	return arr;
    }

}