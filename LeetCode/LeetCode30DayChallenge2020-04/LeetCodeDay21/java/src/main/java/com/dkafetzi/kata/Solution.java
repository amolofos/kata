package com.dkafetzi.kata;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3306/
 * 
 * (This problem is an interactive problem.)
 * 
 * A binary matrix means that all elements are 0 or 1. For each individual row of the matrix,
 * this row is sorted in non-decreasing order. Given a row-sorted binary matrix binaryMatrix,
 * return leftmost column index(0-indexed) with at least a 1 in it. If such index doesn't exist, return -1.
 * You can't access the Binary Matrix directly.  You may only access the matrix using a BinaryMatrix interface:
 * 
 * BinaryMatrix.get(x, y) returns the element of the matrix at index (x, y) (0-indexed).
 * BinaryMatrix.dimensions() returns a list of 2 elements [n, m], which means the matrix is n * m.
 * 
 * Submissions making more than 1000 calls to BinaryMatrix.get will be judged Wrong Answer.
 * Also, any solutions that attempt to circumvent the judge will result in disqualification.
 * For custom testing purposes you're given the binary matrix mat as input in the following four
 * examples. You will not have access the binary matrix directly.
 * 
 * Example 1:
 * Input: mat = [[0,0],[1,1]]
 * Output: 0
 * 
 * Example 2:
 * Input: mat = [[0,0],[0,1]]
 * Output: 1
 * 
 * Example 3:
 * Input: mat = [[0,0],[0,0]]
 * Output: -1
 * 
 * Example 4:
 * Input: mat = [[0,0,0,1],[0,0,1,1],[0,1,1,1]]
 * Output: 1
 * 
 * 1 <= mat.length, mat[i].length <= 100
 * mat[i][j] is either 0 or 1.
 * mat[i] is sorted in a non-decreasing way.
 * 
 */

/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */
public class Solution {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);
	
	
	public int leftMostColumnWithOneBruteForce(BinaryMatrix binaryMatrix) {
    	int result = Integer.MAX_VALUE;
    	
    	List<Integer> dimensions = binaryMatrix.dimensions();
    	int iLength = dimensions.get(0);
    	int jLength = dimensions.get(1);
    	
    	LOGGER.debug("iLength: {}, jLength: {}.", iLength, jLength);
    	
    	if (iLength <= 0 || jLength <= 0)
    		return result;

    	/*
    	 * We need to parse the entire set of rows since we have guarantee order
    	 * in a per row basis, not across across.
    	 */
		int currentLength = jLength;
    	for (int i = 0; i < iLength; i++) {
        	int firstElem = binaryMatrix.get(i, 0);
        	// We get the element of the index that we have 1 now (or the end of the array)
        	// since we do not care about the rest of the elements.
        	int lastElem = binaryMatrix.get(i, currentLength - 1);
        	
        	LOGGER.debug("i: {}, firstElem: {}, lastElem: {}.", i, firstElem, lastElem);

    		if (firstElem == 1) {
    			result = 0;
    			break;
    		}
    		
    		if (lastElem == 0) {
    			continue;
    		}
    		
    		if (lastElem == 1 && result > (currentLength - 1)) {
    			result = currentLength - 1;
    		}
    		
    		// We should search the next row only until the point
    		// where we have found 1 in the previous rows.
    		int currentElem;
    		for (int j = 1; j < currentLength; j++) {
    			currentElem = binaryMatrix.get(i, j);

    			LOGGER.debug("i: {}, j: {}, currentElem: {}, result: {}.", i, j, currentElem, result);
    			if (currentElem == 1) {
    				if (result > j) {
    					result = j;
    					currentLength = j;
    				}
    				break;
    			}
    		}
    	}
    	
    	return result == Integer.MAX_VALUE ? -1 : result;
    }
	

	public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
    	int result = Integer.MAX_VALUE;
    	
    	List<Integer> dimensions = binaryMatrix.dimensions();
    	int iLength = dimensions.get(0);
    	int jLength = dimensions.get(1);
    	
    	LOGGER.debug("iLength: {}, jLength: {}.", iLength, jLength);
    	
    	if (iLength <= 0 || jLength <= 0)
    		return result;

    	/*
    	 * We need to parse the entire set of rows since we have guarantee order
    	 * in a per row basis, not across across.
    	 */
		int currentLength = jLength;
    	for (int i = 0; i < iLength; i++) {
        	int firstElem = binaryMatrix.get(i, 0);
        	// We get the element of the index that we have 1 now (or the end of the array)
        	// since we do not care about the rest of the elements.
        	int lastElem = binaryMatrix.get(i, currentLength - 1);
        	
        	LOGGER.debug("i: {}, firstElem: {}, lastElem: {}.", i, firstElem, lastElem);

    		if (firstElem == 1) {
    			result = 0;
    			break;
    		}
    		
    		if (lastElem == 0) {
    			continue;
    		}
    		
    		if (lastElem == 1 && result > (currentLength - 1)) {
    			result = currentLength - 1;
    		}
    		
    		// Now we need to parse the columns of the row for
    		// row index 0 to currentLength - 1.
    		
    		int left = 0;
    		int right = currentLength - 1;
    		
        	LOGGER.debug("i: {}, currentLength: {}, left: {}, right: {}, result: {}", i, currentLength, left, right, result);

       		while (left >= 0 && right < currentLength && left < right) {
       			
        		int middle = ((right - left) / 2) + left;
        		if ((right - left) % 2 != 0)
        			middle = ((right - left + 1) / 2) + left;
        		
       			int middleElem = binaryMatrix.get(i, middle);
       			
            	LOGGER.debug("i: {}, currentLength: {}, left: {}, right: {}, middle: {}, middleElem: {}, result: {}", i, currentLength, left, right, middle, middleElem, result);

       			if (middleElem == 0) {
       				left = middle;
       			}
       			if (middleElem == 1) {
       				right = middle;
       				if (result > middle)
       					result = middle;
       			}
       			
       			if ((right - left) == 1) {
       				break;
       			}
    		}
       		
       		currentLength  = result;
    	}
    	
    	return result == Integer.MAX_VALUE ? -1 : result;
    }
}