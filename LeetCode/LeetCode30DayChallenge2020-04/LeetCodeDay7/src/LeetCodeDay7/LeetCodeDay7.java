package LeetCodeDay7;

import java.util.HashMap;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3289/
 * 
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * If there're duplicates in arr, count them seperately.
 * 
 * Example 1:
 * Input: arr = [1,2,3]
 * Output: 2
 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
 * 
 * Example 2:
 * Input: arr = [1,1,3,3,5,5,7,7]
 * Output: 0
 * Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
 * 
 * Example 3:
 * Input: arr = [1,3,2,3,5,0]
 * Output: 3
 * Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
 * 
 * Example 4:
 * Input: arr = [1,1,2,2]
 * Output: 2
 * Explanation: Two 1s are counted cause 2 is in arr.
 * 
 * Constraints:
 *   1 <= arr.length <= 1000
 *   0 <= arr[i] <= 1000
 * 
 */
public class LeetCodeDay7 {
	
	
	public static void main (String[] args) {
		LeetCodeDay7 solution = new LeetCodeDay7();

		
		int [] test1 = {1, 2, 3};
    	System.out.println("Result: " + solution.countElements(test1));
    	System.out.println("Input:  [1, 2, 3]");
    	System.out.println("Output: 2");
	
		int [] test2 = {1, 1, 3, 3, 5, 5, 7, 7};
    	System.out.println("Result: " + solution.countElements(test2));
    	System.out.println("Input:  [1, 1, 3, 3, 5, 5, 7, 7]");
    	System.out.println("Output: 0");
    	
		int [] test3 = {1, 3, 2, 3, 5, 0};
    	System.out.println("Result: " + solution.countElements(test3));
    	System.out.println("Input:  [1, 3, 2, 3, 5, 0]");
    	System.out.println("Output: 3");
    	
		int [] test4 = {1, 1, 2, 2};
    	System.out.println("Result: " + solution.countElements(test4));
    	System.out.println("Input:  [1, 1, 2, 2]");
    	System.out.println("Output: 2");
	}
	
    public int countElements(int[] arr) {
        int result = 0;
        HashMap<Integer, Integer> current = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> currentAdd = new HashMap<Integer, Integer>();
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
        	System.out.println("i: " + i + ", arr[i]: " + arr[i]);

       		current.put(arr[i], 1);
       		
       		count = currentAdd.getOrDefault(arr[i] + 1, 0);
       		if (count == 0) {
               	currentAdd.put(arr[i] + 1, 1);
       		} else {
       			currentAdd.replace(arr[i] + 1, count + 1);
       		}
        }
        
        /*
         * [1, 1, 2, 2]
         * [2, 2, 3, 3]
         */
        for (int item : currentAdd.keySet()) {
        	System.out.println("item: " + item + ", currentAdd: " + currentAdd.getOrDefault(item, 0) + ", current: " + current.getOrDefault(item, 0) + ", result: " + result);

        	result += currentAdd.get(item) * current.getOrDefault(item, 0);
        	
        	System.out.println("item: " + item + ", currentAdd: " + currentAdd.getOrDefault(item, 0) + ", current: " + current.getOrDefault(item, 0) + ", result: " + result);

        }
        
        return result;
    }
	
}