/*
 * This is a demo task.
 * Write a function:
 *   class Solution { public int solution(int[] A); }
 * that,
 *   given an array A of N integers,
 *   returns the smallest positive integer (greater than 0) that does not occur in A.
 * 
 * For example,
 *   Given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *   Given A = [1, 2, 3], the function should return 4.
 *   Given A = [−1, −3], the function should return 1.
 * 
 * Assume that:
 *   N is an integer within the range [1..100,000];
 *   each element of array A is an integer within the range [−1,000,000..1,000,000].
 *    
 * Complexity:
 *   expected worst-case time complexity is O(N);
 *   expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 * 
 * Copyright 2009–2018 by Codility Limited. All Rights Reserved.
 * Unauthorized copying, publication or disclosure prohibited. 
 * 
 */
package com.dkafetzi.kata.codility.java.minInteger;

import java.util.*;


public class MinInteger {
	
	public int solution(int[] A) {
		// write your code in Java SE 8
		int result = 0;
		Integer zero = new Integer(0);
		
		Arrays.sort(A);
		Set<Integer> set = new HashSet<Integer>();
		for(int n : A) {
			Integer tmp = new Integer(n);
			if (tmp > zero) {
				set.add(tmp);
			}
		}
		
		List<Integer> listA = new ArrayList<Integer>(set);
			
		int integer_position = 1;
		for (Integer i : listA) {
			if (i.intValue() > integer_position) {
				result = integer_position;
				break;
			}
			integer_position++;
		}
		
		if (result == 0)  {
			result = integer_position;
		}

		return result;
	}
	
}