#!/usr/bin/env python
# -----------------------------------------------------------------------------
# This is based on https://leetcode.com/problems/maximum-subarray/discuss/581559/Python-Super-Easy-99.9-Speed
# -----------------------------------------------------------------------------

from __future__ import print_function
import os
import sys

class Solution:
    def maxSubArray(self, nums: [int]) -> int:
        if not nums:
            return 0

        # Track 3 variables:
        #     1) _sum    : Temporal sum in the array
        #     2) min_sum : Lowest sum found in the array
        #     3) best_sum: Our target result
        # NOTE:
        #  * The best sum is the highest "recovery" from the lowest sum observed,
        #    i.e., best_sum = max( _sum - min_sum )
        _sum     = 0
        min_sum  = 0
        best_sum = float('-inf')
        for x in nums:
            _sum += x
            # Originally I used:
            #      1) best_sum = max(best_sum, _sum - min_sum)
            #      2) min_sum  = min(min_sum, _sum )
            # However, these short statements made the code x3.4 times slower
            if ( _sum - min_sum ) > best_sum:
                best_sum = _sum - min_sum
            if _sum < min_sum:
                min_sum  = _sum
        return best_sum
