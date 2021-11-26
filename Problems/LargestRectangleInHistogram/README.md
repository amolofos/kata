# Question: Largest Rectangle in Histogram
> Given an array of integers heights representing the histogram's
> bar height where the width of each bar is 1, return the area of
> the largest rectangle in the histogram.
>
> Example 1:
> Input: heights = [2,1,5,6,2,3]
> Output: 10
> Explanation: The above is a histogram where width of each bar is 1.
> The largest rectangle is shown in the red area, which has an area = 10 units.
>
> Example 2:
> Input: heights = [2,4]
> Output: 4
>
> Constraints:
>  * 1 <= heights.length <= 105
>  * 0 <= heights[i] <= 104

# Scope
* Decipher a domain in a short time
* Stack data structures

# Script
* Allow the candidate to start and showcase his thought.
* Brute force O(n^2)
* Can they think that our goal is to find how much each element
can expand in left and right direction so we can calculate its
value? A rectangle is afterall width * height.
* If they are strugling to understand it, help them by suggesting
to store the left and right boundaries in separate arrays.
* Hint them that they are interested in when the height decreases.
This will point when we should calculate the rectable from our
index to the current element.
* Point them to stack
* Hint them that they can use the empty array to mean width-from-zero-index
* We actually want to store the shortest elements than our current one
in the stack. This way we postpone to calculate the rectangle area
of the shortest elements until we have reached the correct spot in
the array. E.g. for height 1, that might me index 0 to array.length
if there are no zero elements.

# Edge cases
* Empty input
* One element input

# Solutions
* Brute force
Take each element and check its surrounding area left and
right that it can form a continuous land. The biggest continious
rectangle is our solution
Time: O(n^2), Space: O(1)
* Stack
 The trick in both of these solutions is that we do not have to check all the
 elements to find the left and right boundaries of our current element.
 Another trick is that if we do not have an element in the stack, we consider
 that the left boundary is the beginning of the array.

 * https://leetcode.com/problems/largest-rectangle-in-histogram/discuss/995532/java-or-2-approaches-explained-o(n2)-time-and-o(n)-time
 The trick in both of these solutions is that we do not have to check all the
 elements to find the left and right boundaries of our current element. We do
 that by having two complementary arrays holding the boundaries (left and right).
 We parse the array in direction, left to right, and we keep the latest element
 that its value has not decreased. This will be the left boundary. We repeat for
 the other direction, right to left.
 Time: O(n), Space: O(n)

 * https://leetcode.com/problems/largest-rectangle-in-histogram/discuss/1519257/Java-or-TC%3A-O(N)-or-SC%3A-O(N)-or-Optimal-Stack-solution
 Time: O(n), Space: O(n)

# Sources
## LeetCode
84. Largest Rectangle in Histogram https://leetcode.com/problems/largest-rectangle-in-histogram/
* Hard difficulty
