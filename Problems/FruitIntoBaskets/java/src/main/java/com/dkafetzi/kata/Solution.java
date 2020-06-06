package com.dkafetzi.kata;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* https://leetcode.com/problems/fruit-into-baskets/
*
* See README.md for more information
*
*/
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 * The solution is copied from
	 * https://leetcode.com/problems/fruit-into-baskets/discuss/668709/Sliding-Window-Java-Longest-Subarray-with-atmost-2-Distinct-elements
	 *
	 * Time: O(n)
	 * Space: O(1)
	 */
	public int totalFruit(int[] tree) {
		// The last fruit which we saw.
		int last_fruit = -1;
		// The second last fruit which we saw.
		int second_last_fruit = -1;
		// The number of last fruits present.
		int last_fruit_count = 0;
		// Current count of the two types of fruits.
		int current_max = 0;
		// The ans returning maximum count.
		int max = 0;

		for (int fruit : tree) {
			if (fruit == last_fruit || fruit == second_last_fruit)
				// If the current fruit is same as last fruit and second last fruit we
				// increment the count.
				current_max++;
			else
				// If not we just add 1 to the count of last fruit as the second last
				// fruit is removed and a new fruit is added.
				current_max = last_fruit_count + 1;

			if (fruit == last_fruit)
				// Here we check for the last fruit count.
				last_fruit_count++;
			else
				// If not we settle the count to 1.
				last_fruit_count = 1;

			// If a new fruit is found in the list then we simply change second last
			// fruit to last fruit and current fruit to the last fruit.
			if(fruit != last_fruit) {
				second_last_fruit = last_fruit;
				last_fruit = fruit;
			}

			max = Math.max(max, current_max);
		}

		return max;
	}

	/*
	 * The solution is copied from
	 * https://leetcode.com/problems/fruit-into-baskets/discuss/668709/Sliding-Window-Java-Longest-Subarray-with-atmost-2-Distinct-elements
	 *
	 * Time: O(n ^ 2), worst case since the inner loop might need to go through the entire array.
	 * Space: O(1)
	 */
	public int totalFruitOn2(int[] tree) {
		int max = 0;
		int start = 0;
		int end = 0;
		int counter = 0;
		Map<Integer, Integer> map = new HashMap<>();

		// Parse the entire list of tress: O(n)
		while(end < tree.length) {
			int id = tree[end];
			map.put(id, map.getOrDefault(id, 0) + 1);
			end++;

			// Counter tracks how many new fruit times we have seen.
			if(map.get(id) == 1) {
				counter++;
			}

			/*
			 * If we have seen three or more different fruit types,
			 * loop through the existing trees and start removing
			 * from the beginning until we have two fruit types.
			 *
			 * This again loops through the array. In the worst case
			 * it will need to go through the entire array again.
			 * So O(n).
			 */
			while(counter > 2) {
				int idx = tree[start++];
				map.put(idx, map.getOrDefault(idx, 0) - 1);
				if(map.get(idx) == 0) {
						counter--;
				}
			}
			if(end-start > max) {
				max = end-start;
			}
		}
		return max;
	}
}
