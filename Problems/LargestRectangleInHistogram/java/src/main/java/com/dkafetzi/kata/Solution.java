package com.dkafetzi.kata;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	// https://leetcode.com/problems/largest-rectangle-in-histogram/discuss/995532/java-or-2-approaches-explained-o(n2)-time-and-o(n)-time
	public int largestRectangleAreaOnOn(int[] heights) {
        int maxRectangle = 0;

    	if (heights == null || heights.length <= 0)
    		return maxRectangle;
    	
    	if (heights.length == 1)
    		return heights[0];
    	
		int[] left = new int[heights.length];
		int[] right = new int[heights.length];
		Deque<Integer> stack = new LinkedList<>();

		for (int i = 0; i < heights.length; i++) {
			while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
				stack.pop();
			}
			left[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(i);
		}
		stack.clear();
		for (int i = heights.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
				stack.pop();
			}
			right[i] = stack.isEmpty() ? heights.length : stack.peek();
			stack.push(i);
		}
		for (int i = 0; i < heights.length; i++) {
			maxRectangle = Math.max(maxRectangle, heights[i] * (right[i] - left[i] - 1));
		}
		return maxRectangle;
	}
	
	// https://leetcode.com/problems/largest-rectangle-in-histogram/discuss/1519257/Java-or-TC%3A-O(N)-or-SC%3A-O(N)-or-Optimal-Stack-solution
	public int largestRectangleAreaOnOnOnePass(int[] heights) {
        int maxRectangle = 0;

    	if (heights == null || heights.length <= 0)
    		return maxRectangle;
    	
    	if (heights.length == 1)
    		return heights[0];
	
	    Deque<Integer> stack = new ArrayDeque<>();
	
	    for (int i = 0; i <= heights.length; i++) {
	        while (!stack.isEmpty() && (i == heights.length || heights[stack.peek()] >= heights[i])) {
	            int h = heights[stack.pop()];
	            int left = stack.isEmpty() ? -1 : stack.peek();
	            /**
	             * i-1 - left ==> This is calculating the width of the rectangle. Both ith and
	             * left positions are excluded.
	             */
	            maxRectangle = Math.max(maxRectangle, (i - 1 - left) * h);
	        }
	        stack.push(i);
	    }
	
	    return maxRectangle;
	}

    public int largestRectangleAreaOn2O1(int[] heights) {
        int maxRectangle = 0;

    	if (heights == null || heights.length <= 0)
    		return maxRectangle;
    	
    	if (heights.length == 1)
    		return heights[0];
    	
        
        for (int i = 0; i < heights.length; i++) {
        	int runningRectangle = heights[i];
        	// We go left to find the rectangle area.
            for (int j = i-1; j >= 0; j--) {
            	if (heights[j] < heights[i])
            		break;
            	runningRectangle += heights[i];
            }
        	
        	// We go left to find the rest of the rectangle area.
            for (int j = i+1; j < heights.length; j++) {
            	if (heights[j] < heights[i])
            		break;
            	runningRectangle += heights[i];
            }

             if (runningRectangle > maxRectangle)
            	maxRectangle = runningRectangle;
        }
        
        return maxRectangle;
    }
}
