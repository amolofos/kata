package LeetCodeDay13;

/* 
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3298/
 * 
 *  Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 * 
 * Example 1:
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 * 
 * Example 2:
 * Input: [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * 
 * Note: The length of the given binary array will not exceed 50,000. 
 * 
 */
public class LeetCodeDay13 {
	
	public static void main (String[] args) {
		LeetCodeDay13 solution = new LeetCodeDay13();
		
		int[] test1 = {0, 1};
		System.out.println("Result: " + solution.findMaxLength(test1));
		System.out.println("Input: [0, 1]");
		System.out.println("Output: 2");
	
		int[] test2 = {0, 1, 0};
		System.out.println("Result: " + solution.findMaxLength(test2));
		System.out.println("Input: [0, 1, 0]");
		System.out.println("Output: 2");
		
		int[] test3 = {0, 1, 0, 1};
		System.out.println("Result: " + solution.findMaxLength(test3));
		System.out.println("Input: [0, 1, 0, 1]");
		System.out.println("Output: 4");
	
		int[] test4 = {0, 0, 0, 1, 1, 1, 0};
		System.out.println("Result: " + solution.findMaxLength(test4));
		System.out.println("Input: [0, 0, 0, 1, 1, 1, 0]");
		System.out.println("Output: 6");
		
		int[] test5 = {0, 0, 1, 0, 0, 0, 1, 1};
		System.out.println("Result: " + solution.findMaxLength(test5));
		System.out.println("Input: [0, 0, 1, 0, 0, 0, 1, 1]");
		System.out.println("Output: 6");
		
		int[] test6 = {0, 1, 1, 0, 1, 1, 1, 0};
		System.out.println("Result: " + solution.findMaxLength(test6));
		System.out.println("Input: [0, 1, 1, 0, 1, 1, 1, 0]");
		System.out.println("Output: 4");
	}
	
	public int findMaxLength(int[] nums) {
		return findMaxLengthOptimal(nums);
	}
	
    public int findMaxLengthOptimal(int[] nums) {
        int result = 0;
    	int max = 0;
    
    	int[] zeros = new int [nums.length];
    	int[] ones = new int [nums.length];
    	int runningZeros = 0;
    	int runningOnes = 0;

        for (int i = 0; i < nums.length; i++) {
    		System.out.println("i: " + i + ", runningZeros: " + runningZeros + ", runningOnes: " + runningOnes);

        	runningZeros += nums[i] == 1 ? 1 : 0;
        	runningOnes += nums[i] == 0 ? 1 : 0;
        	
    		System.out.println("i: " + i + ", runningZeros: " + runningZeros + ", runningOnes: " + runningOnes);
    		
        	zeros[i] = runningZeros;
        	ones[i] = runningOnes;
        }
        
    	System.out.println("runningZeros: " + runningZeros + ", runningOnes" + ", max: " + max);
    	if (runningZeros > 0 && runningOnes > 0) {
    		max = runningOnes * 2;
    		if (runningZeros < runningOnes)
    			max = runningZeros * 2;
    	}
        
        result = max;
    	return result;
    }
    
    public int findMaxLengthBruteForce(int[] nums) {
        int result = 0;
    	int max = 0;

        int countOnes = 0;
        int countZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            countOnes = 0;
            countZeros = 0;
        	
            for (int j = i; j < nums.length; j++) {
        		System.out.println("i: " + i + ", j: " + j + ", countZeros: " + countZeros + ", countOnes: " + countOnes + ", max: " + max);
            	countOnes += nums[j] == 1 ? 1 : 0;
            	countZeros += nums[j] == 0 ? 1 : 0;
            	
            	if (countOnes != 0 && countOnes == countZeros)
            		if (max < j - i)
            			max = j - i;
        	}
        }
        
        if (max != 0)
        	max++;

		result = max;
        return result;
    }
}