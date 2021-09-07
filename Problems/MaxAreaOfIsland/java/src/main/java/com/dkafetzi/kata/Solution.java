package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        
        // Find the land.
        for (int i = 0; i < grid.length; i++) {
        	for (int j = 0; j < grid[0].length; j++) {
        		result = Math.max(result, dfs(grid, i, j));
            }
        }
        return result;
    }

    int dfs(int[][] grid, int row, int column) {
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == 0) return 0;
        
        // We set current cell to zero(0) so we do not include it again.
        grid[row][column] = 0;
        
        return 1 +
        		dfs(grid, row + 1, column) +
        		dfs(grid, row - 1, column) +
        		dfs(grid, row,     column + 1) +
        		dfs(grid, row,     column - 1);
    }
}
