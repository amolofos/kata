# Question: MajorityElement
> Given an array nums of size n, return the majority element.
> The majority element is the element that appears more than
> [n / 2] times. You may assume that the majority element
> always exists in the array.
>
> Example 1:
> Input: nums = [3,2,3]
> Output: 3
>
> Example 2:
> Input: nums = [2,2,1,1,1,2,2]
> Output: 2
>
> Constraints:
>  * n == nums.length
>  * 1 <= n <= 5 * 104
>  * -231 <= nums[i] <= 231 - 1
>
> Follow-up: Could you solve the problem in linear time and in O(1) space?

# Script
* Let the candidate start on him/her own.
* Probably they will come up with the Brute force solution.
* Push them for the HashMap or the Sorting solution depending on
  their skills.
* If there is time, hint them for the guaranteed majority. Can they
  describe the Boyer-Moore Voting algorithm?

# Edge cases
* Array being null, empty or 1 element.
* All elements being different (if there was no guarantee about majority existence).
* All elements being the same.

# Solutions
* Brute force with quadratic time and constant space.
* HashMap. Time O(n) and space O(n).
  * Did we use native hashmap functions?
* Sort the array. Time O(nlogn) and space O(1)
* Boyer-Moore Voting Algorithm
  Just read the solution https://leetcode.com/problems/majority-element/solution/.
  Briefly, if there is a majority element it will iron out all the rest elements.
  So we just pick the first element until it reaches the same amount of other elements.
  Once it does, we start anew with the next element in the array.

# Sources
## LeetCode
169. Majority Element: https://leetcode.com/problems/majority-element/
* Easy difficulty
