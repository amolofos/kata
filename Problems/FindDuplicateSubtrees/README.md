# Question: Find Duplicate Subtrees
> Given the root of a binary tree, return all duplicate
> subtrees. For each kind of duplicate subtrees, you only
> need to return the root node of any one of them. Two trees
> are duplicate if they have the same structure with the same
> node values.
>
> Example 1:
> Input: root = [1,2,3,4,null,2,4,null,null,4]
> Output: [[2,4],[4]]
>
> Example 2:
> Input: root = [2,1,1]
> Output: [[1]]
>
> Example 3:
> Input: root = [2,2,2,3,null,3,null]
> Output: [[2,3],[3]]
>
> Constraints:
>  * The number of the nodes in the tree will be in the range [1, 10^4]
>  * -200 <= Node.val <= 200

# Scope
* BFS and DFS
* Tree data structures
* Inorder, preorder and postorder traversal
* Graphs

# Script
* Let the candidate start by him/herself.
* If they are struggling, ask them how they can find duplicates?
Hint them the map structure.
* Have they mentioned BFS and DFS? Have they argued against them?
If not, ask them which one and why.
* Have they mentioned what order they are going to read the nodes (e.g. postorder)?
It does not matter from a functionality perspective. It matters to record all
root, left and right nodes in the hash.
* This can be topped up with questions like
  * What if the tree was a graph?
  Do they take into account vertices and nodes? Do they understand the different
  between a graph and a tree?
  * What if the tree was not binary but N-ary?
  How is the complexity affected?

# Edge cases
* Empty input
* Skewed tree
* Balanced tree

# Solutions
* HashMap + DFS + Recursive approach
  * Time Complexity: O(n) in the worst case for a skewed tree.
  * Space Complexity: O(n) for the hashmap + O(n) on the recursive stack = O(n).

# Resources
* Time and space complexity of trees
https://stackoverflow.com/questions/9844193/what-is-the-time-and-space-complexity-of-a-breadth-first-and-depth-first-tree-tr
  * BFS
    * Time: O(n) for binary tree where n is the number of nodes
    * Space:
      * Perfectly balanced tree O(n/2 + 1),
      * 1 node on each level O(1),
      * N-ary tree with all nodes at the second level O(n-1)
      + the hash map for the duplications
  * DFS
    * Time: O(n) for binary tree where n is the number of nodes
    * Space:
      * Recursive:
        + recursive stack and all the variables including the hash string
          Worst case O(n) with one node on each level.
          Normal case is the balance tree, O(logn)
        + the hash map for the duplications, O(n)
      * Iterative:
      The stack will contain the maximum depth, O(d)
        * Balanced tree O(log n)
        * Best case n-ary tree O(1)
        * Worst case O(n)
        + the hash map for the duplications, O(n)

# Sources
## LeetCode
652. Find Duplicate Subtrees: https://leetcode.com/problems/find-largest-value-in-each-tree-row/
* Medium difficulty
