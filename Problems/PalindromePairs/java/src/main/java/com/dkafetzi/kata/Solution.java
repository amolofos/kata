package com.dkafetzi.kata;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public List<List<Integer>> palindromePairsOn2mO1(String[] words) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
			
		if (words == null || words.length < 2)
			return result;

		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				LOGGER.info("i: {}, j: {}, words[i]: {}, words[j]: {}", i, j, words[i], words[j]);

				String tmp;
				int mid;
				boolean isPalindrome;
				
				// Check i + j.
				isPalindrome = true;
				tmp = words[i] + words[j];
				mid = tmp.length() / 2;
				LOGGER.info("i: {}, j: {}, tmp: {}, mid: {}", i, j, tmp, mid);
				for (int k = mid; k > 0; k--) {
					LOGGER.info("i: {}, j: {}, k: {}, tmp.charAt(k): {}, tmp.charAt(tmp.length() - k): {}", i, j, k, tmp.charAt(k - 1), tmp.charAt(tmp.length() - k));
					if (tmp.charAt(k - 1) != tmp.charAt(tmp.length() - k)) {
						isPalindrome = false;
						break;
					}
				}
				if (isPalindrome) {
					List<Integer> tmpList = new LinkedList<Integer>();
					tmpList.add(i);
					tmpList.add(j);
					result.add(tmpList);
				}
				
				// Check j + i.
				isPalindrome = true;
				tmp = words[j] + words[i];
				mid = tmp.length() / 2;
				LOGGER.info("i: {}, j: {}, tmp: {}, mid: {}", i, j, tmp, mid);
				for (int k = mid; k > 0; k--) {
					LOGGER.info("i: {}, j: {}, k: {}, tmp.charAt(k): {}, tmp.charAt(tmp.length() - k): {}", i, j, k, tmp.charAt(k - 1), tmp.charAt(tmp.length() - k));
					if (tmp.charAt(k - 1) != tmp.charAt(tmp.length() - k)) {
						isPalindrome = false;
						break;
					}
				}
				if (isPalindrome) {
					List<Integer> tmpList = new LinkedList<Integer>();
					tmpList.add(j);
					tmpList.add(i);
					result.add(tmpList);
				}
				
				LOGGER.info("i: {}, j: {}, result: {}", i, j, result);
			}
		}
		return result;
	}
	

	/*
	 * https://leetcode.com/problems/palindrome-pairs/discuss/79217/Accepted-short-Java-solution-using-HashMap
	 * https://leetcode.com/problems/palindrome-pairs/discuss/1270025/Java-Intuitive-Code-With-Some-Explanation-O(N-M2)
	 */
	public List<List<Integer>> palindromePairsOnm2On(String[] words) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int indexEmpty = -1;
		LinkedList<Integer> tmpList;
			
		if (words == null || words.length < 2)
			return result;
		
		for (int i = 0; i < words.length; i++) {
			if (indexEmpty == -1 && words[i].length() == 0) {
				indexEmpty = i;
				continue;
			}

			map.put(words[i], i);
		}

		/*
		 * Handle empty case
		 */
		if (indexEmpty != -1) {
			for (int i = 0; i < words.length; i++) {
				if (indexEmpty == i)
					continue;
				
				if (isPalindrome(words[i])) {
					tmpList = new LinkedList<Integer>();
					tmpList.add(i);
					tmpList.add(indexEmpty);
					result.add(tmpList);
					tmpList = new LinkedList<Integer>();
					tmpList.add(indexEmpty);
					tmpList.add(i);
					result.add(tmpList);
				}
			}
		}
		
		/*
		 * Handle the cases:
		 *  * full mirror, i.e. there is a reverse string in the map
		 *  * partial, i.e. we need another string to complete the palindrome.
		 */
		for (int i = 0; i < words.length; i++) {
			if (indexEmpty == i)
				continue;

	        int l = 0, r = 1;
	        while (l <= r) {
	            String str = words[i].substring(l, r);
	            Integer indexStr = map.get(reverseString(str));
	            
	            if (indexStr != null && indexStr != i) {
	            	if (l == 0 && isPalindrome(words[i].substring(r))) {
						tmpList = new LinkedList<Integer>();
						tmpList.add(i);
						tmpList.add(indexStr);
						result.add(tmpList);
	            	} else if (l != 0 && isPalindrome(words[i].substring(0, l))) {
						tmpList = new LinkedList<Integer>();
						tmpList.add(indexStr);
						tmpList.add(i);
						result.add(tmpList);
	            	}
	            }            
	            
	            if (r < words[i].length()) {
	            	// First start small and reach the full word.
	            	++r;
	            } else {
	            	// And then reduce the full word again.
	            	++l;
	            }
	        }
		}

		return result;
	}
	
	String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	// We just make this more complicated so we can avoid the
	// substring function.
	boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt(s.length()-1-i))
				return false;
		return true;
	}
}
