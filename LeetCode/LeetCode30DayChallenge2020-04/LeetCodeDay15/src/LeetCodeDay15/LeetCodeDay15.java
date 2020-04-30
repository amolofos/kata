package LeetCodeDay15;

import java.util.HashMap;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3300/
 * 
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Example:
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]  
 * Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
 * 
 * Note: Please solve it without division and in O(n).
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 * 
 */
public class LeetCodeDay15 {
	
	public static void main (String[] args) {
		LeetCodeDay15 solution = new LeetCodeDay15();
		
		int[] test1 = {1, 2, 3, 4};
		System.out.println("Result: " + solution.productExceptSelfWrapper(test1));
		System.out.println("Input: {1, 2, 3, 4}");
		System.out.println("Output: {24, 12, 8, 6}");
		
		int[] test2 = {0, 0};
		System.out.println("Result: " + solution.productExceptSelfWrapper(test2));
		System.out.println("Input: {0, 0}");
		System.out.println("Output: {0, 0}");
		
		int[] test3 = {0, 1};
		System.out.println("Result: " + solution.productExceptSelfWrapper(test3));
		System.out.println("Input: {0, 1}");
		System.out.println("Output: {1, 0}");
	}

	public String productExceptSelfWrapper(int[] nums) {
		StringBuilder sb = new StringBuilder();
		int[] result = productExceptSelfOn(nums);
		
		sb.append("{");
		for (int i : result) {
			sb.append(i);
			sb.append(", ");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		sb.append("}");
		
		return sb.toString();
	}
	
	public int[] productExceptSelfOn(int[] nums) {
        int[] result = new int[nums.length];
        
        int multiplier = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
        	result[i] = multiplier;
        	multiplier *= nums[i];
        	
        	System.out.println("i: " + i + ", result[i]: " + result[i] + ", nums[i]: " + nums[i] + ", multiplier: " + multiplier);
        }
        
        multiplier = 1;
        for (int i = 0; i < nums.length; i++) {
        	result[i] *= multiplier;
        	multiplier *= nums[i];
        	
        	System.out.println("i: " + i + ", result[i]: " + result[i] + ", multiplier: " + multiplier);
        }
        
        return result;
	}
	
	public int[] productExceptSelfOnWithDivision(int[] nums) {
        int[] result = new int[nums.length];
    
        int totalProduct = 1;
        int countZeros = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == 0) {
        		countZeros++;
        		continue;
        	}
        	totalProduct *= nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
        	if (countZeros == 1 && nums[i] == 0)
        		result[i] = totalProduct;
        	else if (countZeros == 1 && nums[i] != 0)
        		result[i] = 0;
        	else if (countZeros > 1)
        		result[i] = 0;
        	else
        		result[i] = totalProduct / nums[i];
        }
        
        return result;
	}
	
	public int[] productExceptSelfBruteForce(int[] nums) {
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
        	int product = 1;
        	for (int j = 0; j < nums.length; j++) {
        			System.out.println("i: " + i + ", j: " + j + ", product: " + product);
                	if (j == i)
                		continue;
                	
                	product *= nums[j];
        			System.out.println("i: " + i + ", j: " + j + ", product: " + product);
        	}
        	result[i] = product;
        }
        
        return result;
    }
}