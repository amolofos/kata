# Question: Duplicate Zeros
> Given a fixed-length integer array arr,
> duplicate each occurrence of zero, shifting
> the remaining elements to the right.
>
> Note that elements beyond the length of the
> original array are not written. Do the above
> modifications to the input array in place and
> do not return anything.
>
> Example 1:
> Input: arr = [1,0,2,3,0,4,5,0]
> Output: [1,0,0,2,3,0,0,4]
> Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
>
> Example 2:
> Input: arr = [1,2,3]
> Output: [1,2,3]
> Explanation: After calling your function, the input array is modified to: [1,2,3]
>
> Constraints:
>  * 1 <= arr.length <= 104
>  * 0 <= arr[i] <= 9

# Script
* We are going to present him with the problem statement.
* We will not ask him not to modify the array first.
* Then we will mention that we need space O(1).

# Edge cases
All array elements are zero, [0, 0, 0]
* The new array will have zero as its last element but that is not responsible for the shift of elements.
  [1,0,0,2,3,0,4,5] ⇒ [1,0,0,0,0,2,3,0]
* The new array will have zero as its last element and it is responsible too for the shift of elements.
  [1,5,2,0,6,8,0,6,0] ⇒ [1,5,2,0,0,6,8,0,0]

# Solutions
* 2 encapsulated loops O(n^2).
* 2 independent loops. One to count the zeros and the other to move the elements.

# Sources
## LeetCode
1089. Duplicate Zeros: https://leetcode.com/problems/duplicate-zeros/
* Easy difficulty
