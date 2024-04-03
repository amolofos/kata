# Question: Median of Two Sorted Arrays
> Given two sorted arrays nums1 and nums2 of size m and n
> respectively, return the median of the two sorted arrays.
>
> The overall run time complexity should be O(log (m+n)).
>
> Example 1:
> Input: nums1 = [1,3], nums2 = [2]
> Output: 2.00000
> Explanation: merged array = [1,2,3] and median is 2.
>
> Example 2:
> Input: nums1 = [1,2], nums2 = [3,4]
> Output: 2.50000
> Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
>
> Constraints:
>  * nums1.length == m
>  * nums2.length == n
>  * 0 <= m <= 1000
>  * 0 <= n <= 1000
>  * 1 <= m + n <= 2000
>  * -106 <= nums1[i], nums2[i] <= 106

# Script

# Edge cases

# Solutions

## Brute force

* Merge and sort
Merge the two arrays into a new one and sort them using one of the merge, tim or heap sort
algorithms.
Complexity
  * Time: O(n+m + (n+m)log(n+m)) --> O((n+m)log(n+m))
  * Space: O(n+m + sorting)

* Two pointers
Since we know the location of the median for odd and even sized arrays, we can just have
two pointers, one for each array. We will parse the arrays increasing the pointer whose
value is lower, until we find our elements.
Complexity
  * Time: O(n+m)
  * Space: O(1)

## Binary search
Since we do not care about the rest of the numbers, just the ones that give us the median,
we can jump around doing a binary search. Our aim here is to find the correct indexes in
the two arrays that will allow us to partion the table into two, the first one will have elements
that are all smaller than the second one.
Complexity
  * Time: O(log(min(n + m)). The worst case of O(n+m) is not applicable here since we want the median
  * Space: O(1)

References
* https://leetcode.com/problems/median-of-two-sorted-arrays/discuss/1701107/Java-Binary-Search-Explained

# Sources
## LeetCode
4. Median of Two Sorted Arrays: https://leetcode.com/problems/median-of-two-sorted-arrays
* Hard difficulty
