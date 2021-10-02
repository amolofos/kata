package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/problems/positions-of-large-groups/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int med = -1;
        int result = -1;
        
        if (target >= 0 && nums.length > target && nums[target] == target)
            return target;
        if (nums[0] >= target) 
            return 0;
        if (nums[nums.length - 1] < target) 
            return nums.length;

        while (left <= right) {
           med = left + (right - left) / 2;

            if (nums[med] == target) {
            	result = med;
                break;
            } else if (nums[med] > target) {
                right = med - 1;
            } else {
                left = med + 1;
                result = left;
            }
        }
        
        return result;
    }
}
