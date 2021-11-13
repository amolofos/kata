# Question: Daily Temperatures
> Given an array of integers temperatures represents the daily
> temperatures, return an array answer such that answer[i] is
> the number of days you have to wait after the ith day to get
> a warmer temperature. If there is no future day for which this
> is possible, keep answer[i] == 0 instead.
>
> Example 1:
> Input: temperatures = [73,74,75,71,69,72,76,73]
> Output: [1,1,4,2,1,1,0,0]
>
> Example 2:
> Input: temperatures = [30,40,50,60]
> Output: [1,1,1,0]
>
> Example 3:
> Input: temperatures = [30,60,90]
> Output: [1,1,0]
>
> Constraints:
>  * 1 <= temperatures.length <= 105
>  * 30 <= temperatures[i] <= 100

# Scope
* Showcase stack and monotonic stack knowledge

# Script
* Allow the candidate to start and showcase his thought.
* Probably they will find the brute force solution.
Can they reduce the O(n) space to O(1)?
* Push them to see if they can find any other solution.
Give them a guide that we care about linear time.
Give them a hint to store the missing elements somewhere.
 * Did they find the stack?
 Mention it to them.

# Edge cases
* Null
* Empty
* Size = 1

# Solutions
* Brute force
Loop through all the elements and check them against the rest of
the elements in the array.
Time: O(n^2), Space: O(n) or O(1) if we store the values in the same array.
* Monotonic stack
Parse the array and store the index that we need to find the temperature in a stack.
Then for each element that we see in the array, check the elements in the stack.
Compare the temperatures accordingly.
Time: O(n), Space: (n) worst case.

# Sources
## LeetCode
739. Daily Temperatures https://leetcode.com/problems/daily-temperatures/
* Medium difficulty
