#!/usr/bin/env python

from __future__ import print_function
import os
import sys

import unittest
from PositionsOfLargeGroups import Solution

class TestPositionsOfLargeGroups(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_test1(self):
	    # Example 1:
	    # Input: "abbxxxxzzy"
	    # Output: [[3,6]]
	    # Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
        input = "abbxxxxzzy"
        expectedOutput = []
        expectedOutput.append([3, 6])

        output = self.solution.largeGroupPositions(input)

        print("Input: %s, Expected output: %s, Output: %s." % (input, ' '.join(map(str, expectedOutput)), ' '.join(map(str, output))))

        self.assertCountEqual(output, expectedOutput)

    def test_test2(self):
		# Example 2:
		# Input: "abc"
		# Output: []
		# Explanation: We have "a","b" and "c" but no large group.
        input = "abc"
        expectedOutput = []

        output = self.solution.largeGroupPositions(input)

        print("Input: %s, Expected output: %s, Output: %s." % (input, ' '.join(map(str, expectedOutput)), ' '.join(map(str, output))))

        self.assertCountEqual(output, expectedOutput)

    def test_test3(self):
		# Example 3:
		# Input: "abcdddeeeeaabbbcd"
		# Output: [[3,5],[6,9],[12,14]]
        input = "abcdddeeeeaabbbcd"
        expectedOutput = []
        expectedOutput.append([3, 5])
        expectedOutput.append([6, 9])
        expectedOutput.append([12, 14])

        output = self.solution.largeGroupPositions(input)

        print("Input: %s, Expected output: %s, Output: %s." % (input, ' '.join(map(str, expectedOutput)), ' '.join(map(str, output))))

        self.assertCountEqual(output, expectedOutput)

    def test_test43(self):
        # Test case:
		# Input: "aaa"
		# Output: [[0,2]]
        input = "aaa"
        expectedOutput = []
        expectedOutput.append([0, 2])

        output = self.solution.largeGroupPositions(input)

        print("Input: %s, Expected output: %s, Output: %s." % (input, ' '.join(map(str, expectedOutput)), ' '.join(map(str, output))))

        self.assertCountEqual(output, expectedOutput)


if __name__ == "__main__":
    unittest.main()
