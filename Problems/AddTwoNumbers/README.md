# Question: AddTwoNumbers
> You are given two non-empty linked lists representing
> two non-negative integers. The digits are stored in reverse
> order, and each of their nodes contains a single digit. Add
> the two numbers and return the sum as a linked list.

> You may assume the two numbers do not contain any leading
> zero, except the number 0 itself.

> Example 1:
> Input: l1 = [2,4,3], l2 = [5,6,4]
> Output: [7,0,8]
> Explanation: 342 + 465 = 807.

> Example 2:
> Input: l1 = [0], l2 = [0]
> Output: [0]

> Example 3:
> Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
> Output: [8,9,9,9,0,0,0,1]

> Constraints:
>  * The number of nodes in each linked list is in the range [1, 100].
>  * 0 <= Node.val <= 9
>  * It is guaranteed that the list represents a number that does not have leading zeros.

# Script
* Let the candidate start by him/herself.
* Point out the edge cases if he has forgotten them.
* He will quickly come up with the O(max(n,m)) space solution.
* Push him to implement the O(1) space solution.
* How well does he know lists?

# Edge cases
* Lists do not have the same number of elements
* One list is empty
* Adding the final elements generates a carry
l1=[9,9], l2=[1], output=[0,0,1]

# Solutions
* One while and a final check for the carry over.
Time O(max(n,m)), Space O(max(n,m))
* One while using one of the lists to store the sum
Time O(max(n,m)), Space O(1)

# Sources
## LeetCode
2. AddTwoNumbers: https://leetcode.com/problems/add-two-numbers/
* Medium difficulty
