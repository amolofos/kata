package LeetCodeDay17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Stack;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3302/
 * 
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally
 * or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 * Output: 1
 *
 * Example 2:
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 * Output: 3
 *
 */
public class LeetCodeDay17 {
	
	public static void main (String[] args) {
		LeetCodeDay17 solution = new LeetCodeDay17();
		
		char[][] test1 = {
				{'1', '1', '1', '1', '0'},
				{'1', '1', '0', '1', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '0', '0', '0'}
		};
		System.out.println("Result: " + solution.numIslandsWrapper(test1));
		System.out.println("Output: 1");

		char[][] test2 = {
				{'1', '1', '0', '0', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '1', '0', '0'},
				{'0', '0', '0', '1', '1'}
		};
		System.out.println("Result: " + solution.numIslandsWrapper(test2));
		System.out.println("Output: 3");
		
		char[][] test3 = {};
		System.out.println("Result: " + solution.numIslandsWrapper(test3));
		System.out.println("Output: 0");
		
		char[][] test4 = {
				{'1'}
		};
		System.out.println("Result: " + solution.numIslandsWrapper(test4));
		System.out.println("Output: 1");
		
	
		char[][] test5 = {
				{'1', '1', '1'},
				{'0', '1', '0'},
				{'1', '1', '1'}
		};
		System.out.println("Result: " + solution.numIslandsWrapper(test5));
		System.out.println("Output: 1");
		
		char[][] test6 = {
				{'1', '0', '1', '1', '1'},
				{'1', '0', '1', '0', '1'},
				{'1', '1', '1', '0', '1'}
		};
		System.out.println("Result: " + solution.numIslandsWrapper(test6));
		System.out.println("Output: 1");
	}
	
	
	public int numIslandsWrapper(char[][] grid) {
	    return numIslandsBruteForce(grid);
	}
	
	public int numIslandsBruteForce(char[][] grid) {
    	A<String, ArrayList<String>> neighbors = new HashMap<String, ArrayList<String>>();
		Stack<String> stack = new Stack<String>();
		
		int islandsCount = 0;
	    
		int iLength = grid.length;
    	System.out.println("iLength: " + iLength);
    	if (iLength <= 0) {
    		return islandsCount;
    	}
    	
    	int jLength = grid[0].length;
    	System.out.println("jLength: " + jLength);
    	if (jLength <= 0) {
    		return islandsCount;
    	}
    	
    	for (int i = 0; i < iLength; i++) {
    		for (int j = 0; j < jLength; j++) {
    			System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] + ", islandsCount: " + islandsCount);

    			if (grid[i][j] == '0') {
    				System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] + ", skip.");
    				continue;
    			}
    			
    			/*
    			 * We have four neighbors that we want to check.
    			 *  (i - 1, j - 1) (i - 1, j) (i - 1, j + 1)
    			 *  (i    , j - 1) (i,     j) (i    , j + 1)
    			 *  (i + 1, j - 1) (i + 1, j) (i + 1, j + 1)
    			 */
				String key = i + "," + j;
    			if (i - 1 >= 0 && grid[i-1][j] == '1') {
    				String neighborKey = (i - 1) + "," + j;
    				neighbors.put(key, neighborKey);
    			}
    			if (j - 1 >= 0 && grid[i][j-1] == '1') {
    				String neighborKey = i + "," + (j - 1);
    				neighbors.put(key, neighborKey);
    			}
    			
    			if (j + 1 < jLength && grid[i][j+1] == '1') {
    				String neighborKey = i + "," + (j + 1);
    				neighbors.put(key, neighborKey);
    			}
    			if (i + 1 < iLength && grid[i+1][j] == '1') {
    				String neighborKey = (i + 1) + "," + j;
    				neighbors.put(key, neighborKey);
    			}
    			
				neighbors.put(key, key);
    		}
    	}
    	
    	islandsCount = 0;
    	for (Entry<String, ArrayList<String>> key : neighbors.entrySet()) {
    		for (String neighbor : key.getValue()) {
    	    	
    		}
    	}
    	
		return islandsCount;
	}
	
    public int numIslandsWorng(char[][] grid) {
    	HashMap<String, Integer> islands = new HashMap<String, Integer>();
    	int islandsCount = 0;
    	
    	int iLength = grid.length;
    	System.out.println("iLength: " + iLength);
    	if (iLength <= 0) {
    		return islandsCount;
    	}
    	
    	int jLength = grid[0].length;
    	System.out.println("jLength: " + jLength);
    	if (jLength <= 0) {
    		return islandsCount;
    	}
    	
    	for (int i = 0; i < iLength; i++) {
    		for (int j = 0; j < jLength; j++) {
    			boolean found = false;
    			ArrayList<String> neighbors = new ArrayList<String>();
    			System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] + ", islandsCount: " + islandsCount);
    			
    			if (grid[i][j] == '0') {
    				System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] + ", skip.");
    				continue;
    			}
    			
    			/*
    			 * We have four neighbors that we want to check.
    			 *  (i - 1, j - 1) (i - 1, j) (i - 1, j + 1)
    			 *  (i    , j - 1) (i,     j) (i    , j + 1)
    			 *  (i + 1, j - 1) (i + 1, j) (i + 1, j + 1)
    			 */
				String key = i + "," + j;
    			if (i - 1 >= 0 && grid[i-1][j] == '1') {
    				String neighborKey = (i - 1) + "," + j;
    				
    				if (islands.containsKey(neighborKey)) {
    					islands.put(key, islands.get(neighborKey));
    				
    					System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] + ", islandsCount: " + islandsCount + ", i-1");
    					found = true;
    				}
    				neighbors.add(neighborKey);
    			}
    			if (j - 1 >= 0 && grid[i][j-1] == '1') {
    				String neighborKey = i + "," + (j - 1);
    				
    				if (islands.containsKey(neighborKey)) {
    					islands.put(key, islands.get(neighborKey));
    				
    					System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] + ", islandsCount: " + islandsCount + ", j-1");
    					found = true;
    				}
    				neighbors.add(neighborKey);
    			}
    			
    			if (j + 1 < jLength && grid[i][j+1] == '1') {
    				String neighborKey = i + "," + (j + 1);
    				
    				if (islands.containsKey(neighborKey)) {
    					islands.put(key, islands.get(neighborKey));
    			
    					System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] + ", islandsCount: " + islandsCount + ", j+1");
    					found = true;
    				}
    				neighbors.add(neighborKey);
    			}
    			if (i + 1 < iLength && grid[i+1][j] == '1') {
    				String neighborKey = (i + 1) + "," + j;
    				
    				if (islands.containsKey(neighborKey)) {
    					islands.put(key, islands.get(neighborKey));
    				
    					System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] + ", islandsCount: " + islandsCount + ", i+1");
    					found = true;
    				}
    				neighbors.add(neighborKey);
    			}
    			
    			if (!found) {
    				islands.put(key, islandsCount);
    				islandsCount++;
    			}
    			
    			Iterator<String> iter = neighbors.iterator();
				while (iter.hasNext()) {
					String next = iter.next();
					System.out.println("next: \"" + next + "\", islandsCount: " + islandsCount);
					islands.put(next, islandsCount);
				}
				
				
				System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] + ", islandsCount: " + islandsCount);
    		}
    	}

    	return islandsCount;
    }
}