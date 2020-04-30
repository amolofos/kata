package LeetCodeDay18;

import java.util.Stack;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3303/
 *
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes
 * the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 * Example:
 * Input:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * Output: 7 
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 * 
 */
public class LeetCodeDay18 {
	
	public static void main (String[] args) {
		LeetCodeDay18 solution = new LeetCodeDay18();
		
		int[][] test1 = {
				{1, 3, 1},
				{1, 5, 1},
				{4, 2, 1}
		};
		System.out.println("Result: " + solution.minPathSumWrapper(test1));
		System.out.println("Output: 7");
	}
	
	
	public int minPathSumWrapper(int[][] grid) {
    	return minPathSumBruteForce(grid);
	}
	
	
    public int minPathSumBruteForce(int[][] grid) {
    	int result = 0;
    	
    	int iLength = grid.length;
    	if (iLength == 0)
    		return result;
    	
    	int jLength = grid[0].length;
    	if (jLength == 0)
    		return result;
    	
		Stack<Node> stack = new Stack<Node>();
		stack.push(new Node(grid[0][0], 0, 0));
		int i = 0;
		int j = 0;
		int currentMax = Integer.MAX_VALUE;
		while (!stack.isEmpty()) {
			Node currentNode = stack.pop();
			
			System.out.println("Pop  node: i: " + currentNode.i + ", j: " + currentNode.j + ", value: " + currentNode.value);
			if (i < iLength - 1) {
				System.out.println("Push node: i: " + (i + 1) + ", j: " + j + ", value: " + grid[i+1][j]);
				stack.push(new Node(grid[i + 1][j], i + 1, j));
			}
			if (i <= iLength - 1 && j < jLength - 1) {
				System.out.println("Push node: i: " + i + ", j: " + (j + 1) + ", value: " + grid[i][j + 1]);
				stack.push(new Node(grid[i][j + 1], i, j + 1));
			}
			/*
			if (i <= iLength - 1 && j > 1 && j < jLength - 1) {
				System.out.println("Push node: i: " + i + ", j: " + (j - 1) + ", value: " + grid[i][j - 1]);
				stack.push(new Node(grid[i][j - 1], i, j - 1));
			}
			*/
			
			System.out.println("i: " + i + ", j: " + j);
			if (i <= iLength - 1) {
				j++;
				if (j > jLength - 1) {
					j = 0;
					i++;
				}
			}
			System.out.println("i: " + i + ", j: " + j);
			
		}
    	
    	return result;
    }
    
    private class Node {
    	int i;
    	int j;
    	int value;
    	
    	public Node(int value, int i, int j) {
    		this.value = value;
    		this.i = i;
    		this.j = j;
    	}
    }
}