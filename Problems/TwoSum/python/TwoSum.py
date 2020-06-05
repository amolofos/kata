#!/usr/bin/env python
# -----------------------------------------------------------------------------
# This is based on https://leetcode.com/problems/maximum-subarray/discuss/581559/Python-Super-Easy-99.9-Speed
# -----------------------------------------------------------------------------

from __future__ import print_function
import os
import sys

class Solution:
    def twoSum_BruteForce(self, nums: [int], target: int) -> [int]:
        for i in range(0, len(nums)):
            for j in range(i+1, len(nums)):
                if (nums[j] == target - nums[i]):
                    return [i, j]

        return []

    def twoSum_Dictionary(self, nums: [int], target: int) -> [int]:
        '''
            This is based on
            https://leetcode.com/problems/two-sum/discuss/624079/Python-hashmapdict-92
        '''

        memory = {}
        for i, e in enumerate(nums):
            if e in memory:
                return (memory[e], i)

            memory[(target - e)] = i

        return []
