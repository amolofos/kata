#!/usr/bin/env python

from __future__ import print_function
import os
import sys

class Solution:
    def largeGroupPositions(self, S: str) -> [[int]]:
        result = []

        if (len(S) <= 0):
            return result

        startIndex = endIndex = 0
        charCurrent = S[0]

        for i in range(0, len(S)):
            if (S[i] == charCurrent):
                endIndex = i

                if (i != len(S) - 1):
                    continue

            lengthCurr = endIndex - startIndex + 1
            if (lengthCurr >= 3):
                result.append([startIndex, endIndex])

            startIndex = endIndex = i
            charCurrent = S[i]

        return result
