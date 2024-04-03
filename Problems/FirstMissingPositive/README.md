# Question: FirstMissingPositive
> Given an unsorted integer array nums, return the
> smallest missing positive integer. You must implement
> an algorithm that runs in O(n) time and uses constant
> extra space.
>
> Example 1:
> Input: nums = [1,2,0]
> Output: 3
>
> Example 2:
> Input: nums = [3,4,-1,1]
> Output: 2
>
> Example 3:
> Input: nums = [7,8,9,11,12]
> Output: 1
>
> Constraints:
>  * 1 <= nums.length <= 5 * 105
>  * -231 <= nums[i] <= 231 - 1
>

# Script
* Let the candidate start by him/herself.
* Can they state the unique attributes of the problem?
I.e. first positive integer in an integer array. Can they
relate the solution to the array size?
* Maybe their first thought is to sort the array and then find the missing element.
Can they choose a sort algorithm? Can they name them?
Note that the best most common theoretical solution here is Heapsort with Time O(nlogn) and Space O(1).
Have they mentioned the cycle sort?
* Try to guide them to state the possible return values.
* Maybe they will come up with an O(n) space solution.
They might store the positive integers in a set or an array. Then they will
parse the set or array to find the missing integer.
* Point to them, that we can store the values in the existing array.
* Guide them to cycle sort algorithm.

# Edge cases
* Zero length array
* 1 element array
* all negative integers array

# Solutions
* Time O(n) and space O(n).
Use another array or set to store the positive integers and then loop through them.
* Sort and loop. Time O(nlogn + n) and space O(1).
* Move the positive integers to their index. Time O(n) and space O(1).
This is achieved by looping through the array and putting the positive elements
smaller than A.length in the respective array index. This way we sort the array.
Then we loop through it and we pick the first index that does not have the same
value.
The trick here is to understand that since we want the first positive integer, the
possible solutions start from 1 and end with A.length + 1.
Note that there are two ways to do this.
  * One is to mark all negative integers as index + 1. Then populate the index with the negative
  value of the positive integer that exists. Finally, loop through the array. The first non
  negative element is our solution.
  This is called cycle sort algorithm.
  * The other option is to move the positive integer to its index and keep doing that until we have
  move all of the positive integers and reach the end of the array. The first element whose value
  does not match its index, is our solution.
* Integers encode trick. Time O(n), space O(1).
See https://leetcode.com/problems/first-missing-positive/discuss/17135/Java-solution-with-integers-encode-trick-explained
If we have two integers k and m and m is always less than some n - we can encode both into one integer using formula:
```
r = k * n + m
(m < n)
```
and now to retrieve them use the following:
```
k = r / n
m = r % n
```

# Sources
## LeetCode
41. First Missing Positive: https://leetcode.com/problems/first-missing-positive
* Hard difficulty
