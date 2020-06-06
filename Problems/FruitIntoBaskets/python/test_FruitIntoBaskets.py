#!/usr/bin/env python

from __future__ import print_function
import os
import sys

import unittest
from FruitIntoBaskets import Solution

class TestFruitIntoBaskets(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_test1(self):
        # Example 1:
        # Input: [1,2,1]
        # Output: 3
        # Explanation: We can collect [1,2,1].
        input = [1, 2, 1]
        expectedOutput = 3

        output = self.solution.totalFruitOn2(input)

        print("Input: %s, Expected output: %s, Output: %s." % (' '.join(map(str, input)), expectedOutput, output))

        self.assertEqual(output, expectedOutput)

    def test_test2(self):
        # Example 2:
        # Input: [0,1,2,2]
        # Output: 3
        # Explanation: We can collect [1,2,2].
        # If we started at the first tree, we would only collect [0, 1].
        input = [0, 1, 2, 2]
        expectedOutput = 3

        output = self.solution.totalFruitOn2(input)

        print("Input: %s, Expected output: %s, Output: %s." % (' '.join(map(str, input)), expectedOutput, output))

        self.assertEqual(output, expectedOutput)

    def test_test3(self):
        # Example 3:
        # Input: [1,2,3,2,2]
        # Output: 4
        # Explanation: We can collect [2,3,2,2].
        # If we started at the first tree, we would only collect [1, 2].
        input = [1, 2, 3, 2, 2]
        expectedOutput = 4

        output = self.solution.totalFruitOn2(input)

        print("Input: %s, Expected output: %s, Output: %s." % (' '.join(map(str, input)), expectedOutput, output))

        self.assertEqual(output, expectedOutput)

    def test_test4(self):
        # Example 4:
        # Input: [3,3,3,1,2,1,1,2,3,3,4]
        # Output: 5
        # Explanation: We can collect [1,2,1,1,2].
        # If we started at the first tree or the eighth tree, we would only collect 4 fruits.
        input = [3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4]
        expectedOutput = 5

        output = self.solution.totalFruitOn2(input)

        print("Input: %s, Expected output: %s, Output: %s." % (' '.join(map(str, input)), expectedOutput, output))

        self.assertEqual(output, expectedOutput)

if __name__ == "__main__":
    unittest.main()
