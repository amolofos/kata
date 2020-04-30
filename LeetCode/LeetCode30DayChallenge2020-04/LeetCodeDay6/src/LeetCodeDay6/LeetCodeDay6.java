package LeetCodeDay6;

import java.util.List;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3288/
 * 
 * Given an array of strings, group anagrams together.
 *
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * 
 * Note:
 *   All inputs will be in lowercase.
 *   The order of your output does not matter.
 * 
 */
public class LeetCodeDay6 {
	
	
	public static void main (String[] args) {
		LeetCodeDay6 solution = new LeetCodeDay6();

		
		String [] test1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
    	System.out.println("Result: " + solution.groupAnagrams(test1));
    	System.out.println("Input:  [\"eat\", \"tea\", \"tan\", \"ate\", \"nat\", \"bat\"]");
    	System.out.println("Output: [ [\"ate\", \"eat\", \"tea\"], [\"nat\", \"tan\"], [\"bat\"] ]");
	}
	
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> result = null;
    	
    	for (int i = 0; i < strs.length; i++) {
    		strs[i].toCharArray().
    		
    	}
    	
    	
    	return result;
    }
}