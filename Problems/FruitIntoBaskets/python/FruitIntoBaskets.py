#!/usr/bin/env python
# -----------------------------------------------------------------------------
# This is based on https://leetcode.com/problems/fruit-into-baskets/
# -----------------------------------------------------------------------------

from __future__ import print_function
import os
import sys

class Solution:

	# The solution is copied from
	# https://leetcode.com/problems/fruit-into-baskets/discuss/653536/Python3-Max-Size-Subarray-with-atmost-2-Distinct-elements
	#
	# Time: O(n ^ 2), worst case
	# Space: O(1)
    def totalFruitOn2(self, tree: [int]) -> int:
        cnt = {}
        j = 0
        ans = 0
        for i in range(len(tree)):
            cnt[tree[i]] = cnt.get(tree[i], 0) + 1
            while len(cnt.keys()) > 2:
                cnt[tree[j]] -= 1
                if cnt[tree[j]] == 0:
                    del cnt[tree[j]]
                j += 1
            ans = max(ans, i - j + 1)
        return ans
