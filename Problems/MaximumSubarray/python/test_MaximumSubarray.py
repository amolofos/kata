#!/usr/bin/env python

from __future__ import print_function
import os
import sys

import unittest
from MaximumSubarray import Solution

class TestMaximumSubarray(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_test1(self):
        # Example 1:
        # Input: [-2,1,-3,4,-1,2,1,-5,4],
        # Output: 6
        # Explanation: [4,-1,2,1] has the largest sum = 6.
        input = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
        expectedOutput = 6

        output = self.solution.maxSubArray(input)

        print("Input: %s, Expected output: %s, Output: %s." % (' '.join(map(str, input)), expectedOutput, output))

        self.assertEqual(output, expectedOutput)

if __name__ == "__main__":
    unittest.main()
