# Question: Find All Duplicates in an Array
> Given an integer array nums of length n where
> all the integers of nums are in the range [1, n]
> and each integer appears once, twice or more, return
> an array of all the integers that appears twice.
>
> You must write an algorithm that runs in O(n)
> time and uses only constant extra space.
>
> Example 1:
> Input: nums = [4,3,2,7,8,2,3,1]
> Output: [2,3]
>
> Example 2:
> Input: nums = [1,1,2]
> Output: [1]
>
> Example 3:
> Input: nums = [1]
> Output: []
>
> Constraints:
>  * n == nums.length
>  * 1 <= n <= 105
>  * 1 <= nums[i] <= n
>  * Each element in nums appears once or twice.

# Script
* Let the candidate start by him/herself.
* Probably they will come up with a hashmap solution
Time O(n), Space O(n)
* Give them a hint for some kind of sorting and a final pass.
Complexity will depend on the sorting algorithm. The best one
should be HeapSort
Time O(n * logn), Space O(1)
* Give them a hint whether they can use the same array to store
the counts. We can parse the elements and store negative counts.
The we will need a final pass to find the ones that are seen twice.
Time O(n), Space O(1)

# Edge cases
* Empty input
* Array with zero or 1 length
* None duplicate
* All the same elements

# Solutions
* HashMap: Time O(n), Space O(n)
* Sort and count: HeapSort has Time O(n * logn), Space O(1)
* Count negatives in the same array and final pass: Time O(n), Space O(1)

# Sources
## LeetCode
442. Find All Duplicates in an Array: https://leetcode.com/problems/find-all-duplicates-in-an-array/
* Medium difficulty
