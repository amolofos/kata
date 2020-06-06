# Question: Fruit Into Baskets
> Let's say that we have a row of trees where the i-th tree produces fruit with
> type tree[i]. We also have two baskets, and each basket can carry any quantity
> of fruit, but each basket can carry only one type of fruit.
>
> We collect the fruits into the basket following the below process:
> You start at any tree of your choice, then repeatedly perform the following steps:
>  * Add one piece of fruit from this tree to your baskets. If you cannot, stop.
>  * Move to the next tree to the right of the current tree. If there is no tree to the right, stop.
>
> Note that you do not have any choice after the initial choice of starting tree:
> you must perform step 1, then step 2, then back to step 1, then step 2,
> and so on until you stop.
>
> What is the maximum total amount of fruit one can collect with this procedure?
>
> Example 1:
> Input: [1,2,1]
> Output: 3
> Explanation: We can collect [1,2,1].
>
> Example 2:
> Input: [0,1,2,2]
> Output: 3
> Explanation: We can collect [1,2,2].
> If we started at the first tree, we would only collect [0, 1].
>
> Example 3:
> Input: [1,2,3,2,2]
> Output: 4
> Explanation: We can collect [2,3,2,2].
> If we started at the first tree, we would only collect [1, 2].
>
> Example 4:
> Input: [3,3,3,1,2,1,1,2,3,3,4]
> Output: 5
> Explanation: We can collect [1,2,1,1,2].
> If we started at the first tree or the eighth tree, we would only collect 4 fruits.
>
> Note:
>  * 1 <= tree.length <= 40000
>  * 0 <= tree[i] < tree.length

# Sources
## LeetCode
904. Fruit Into Baskets: https://leetcode.com/problems/fruit-into-baskets/

