package LeetCodeDay19;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3304/
 * 
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * 
 */
public class LeetCodeDay19 {
	
	public static void main (String[] args) {
		LeetCodeDay19 solution = new LeetCodeDay19();
		
		int[] test1 = {4, 5, 6, 7, 0, 1, 2};
		System.out.println("Result: " + solution.searchWrapper(test1, 0));
		System.out.println("Input : target = 0, nums = {4, 5, 6, 7, 0, 1, 2}");
		System.out.println("Output: 4");
		
		int[] test2 = {4,5,6,7,0,1,2};
		System.out.println("Result: " + solution.searchWrapper(test2, 3));
		System.out.println("Input : target = 3, nums = {4, 5, 6, 7, 0, 1, 2}");
		System.out.println("Output: -1");
		
		int[] test3 = {};
		System.out.println("Result: " + solution.searchWrapper(test3, 3));
		System.out.println("Input : target = 3, nums = {}");
		System.out.println("Output: -1");
		
		int[] test4 = {3, 1};
		System.out.println("Result: " + solution.searchWrapper(test4, 1));
		System.out.println("Input : target = 1, nums = {3, 1}");
		System.out.println("Output: 1");
	}


    public int searchWrapper(int[] nums, int target) {
    	return searchBruteForce(nums, target);
    }


    public int searchBruteForce(int[] nums, int target) {
    	int result = -1;
    	int length = nums.length;
    	
    	if (length <= 0)
    		return result;
    	
    	if (target == nums[0]) {
    		result = 0;
    	} else if (target < nums[0]) {
    		for (int i = length - 1; i > 0; i--) {
    			if (target == nums[i]) {
    				result = i;
    				break;
    			}
    			if (target > nums[i])
    				break;
    		}
    	} else {
    		for (int i = 1; i < length; i++) {
    			if (target == nums[i]) {
    				result = i;
    				break;
    			}
    			if (target < nums[i])
    				break;
    		}
    	}
    	
    	return result;
    }
}