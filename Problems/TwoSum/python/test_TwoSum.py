#!/usr/bin/env python

from __future__ import print_function
import os
import sys

import unittest
from TwoSum import Solution

class TestTwoSums(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

        self.modeMap = {
            "BruteForce": self.solution.twoSum_BruteForce,
            "Dictionary": self.solution.twoSum_Dictionary
        }

    def execute_test1(self, mode):
        # Example 1:
        # Given nums = [2, 7, 11, 15], target = 9,
        # Because nums[0] + nums[1] = 2 + 7 = 9,
        # return [0, 1].
        input = [2, 7, 11, 15]
        target = 9
        expectedOutput = [0, 1]

        functionStr = self.modeMap[mode]
        output = functionStr(input, target)

        print("Input: %s, Target: %s, Expected output: %s, Output: %s." % (
            ' '.join(map(str, input)),
            target,
            ' '.join(map(str, expectedOutput)),
            ' '.join(map(str, output))
        ))

        self.assertCountEqual(output, expectedOutput)

    def test_test1_BruteForce(self):
        self.execute_test1("BruteForce")

    def test_test1_Dictionary(self):
        self.execute_test1("Dictionary")

if __name__ == "__main__":
    unittest.main()
