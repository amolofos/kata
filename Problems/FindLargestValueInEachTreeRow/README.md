# Question: Find Largest Value in Each Tree Row
> Given the root of a binary tree, return an array
> of the largest value in each row of the tree (0-indexed).
>
> Example 1:
> Input: root = [1,3,2,5,3,null,9]
> Output: [1,3,9]
>
> Example 2:
> Input: root = [1,2,3]
> Output: [1,3]
>
> Example 3:
> Input: root = [1]
> Output: [1]
>
> Example 4:
> Input: root = [1,null,2]
> Output: [1,2]
>
> Example 5:
> Input: root = []
> Output: []
>
> Constraints:
>  * The number of nodes in the tree will be in the range [0, 104].
>  * -231 <= Node.val <= 231 - 1

# Script
* Let the candidate start by him/herself.
* Does he/she mention anything about BFS or DFS?
  * Extra points if he mentioned in order traversal etc.
* If he asks whether he should write the code for the
  TreeNode structure, answer depending on how much time
  is remaining and how confident he is.
* Does he/she choose iterative or recursive tree traversal?
  Does he/she mention queues and how they are implemented in
  his/her language of preference (e.g. LinkedList in java)?

# Edge cases
* Null root
* Just one root
* Some elements of the tree are null

# Solutions
* BFS, iterative or recursive
 * Recursive
  https://leetcode.com/problems/find-largest-value-in-each-tree-row/discuss/1121345/Java-Solutions
  * Time Complexity: O(n^2) in worst case. O(n) + O(n-1) + O(n-2) + .. + O(1) which is O(n^2).
  * Space Complexity: O(n) in worst case.
    For a skewed tree, O(n) space for call stack.
    For a Balanced tree, the call stack uses O(log n) space, (i.e., the height of the balanced tree).
  * Using a queue
   * Time Complexity: O(n) where n is the number of nodes in the binary tree
   * Space Complexity: O(n) where n is the number of nodes in the binary tree
See https://www.geeksforgeeks.org/level-order-tree-traversal/

# Sources
## LeetCode
515. Find Largest Value in Each Tree Row: https://leetcode.com/problems/find-largest-value-in-each-tree-row/
* Medium difficulty
