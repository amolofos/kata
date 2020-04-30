package LeetCodeDay12;

import java.util.Comparator;
import java.util.LinkedList;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3297/
 * 
 * We have a collection of stones, each stone has a positive integer weight.
 * Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
 * 
 * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 * 
 * Example 1:
 * Input: [2,7,4,1,8,1]
 * Output: 1
 * Explanation: 
 *   We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 *   we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 *   we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 *   we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
 * 
 * Note:
 *   1 <= stones.length <= 30
 *   1 <= stones[i] <= 1000
 * 
 */
public class LeetCodeDay12 {
	
	public static void main (String[] args) {
		LeetCodeDay12 solution = new LeetCodeDay12();
		
		
		int[] test1 = {2, 7, 4, 1, 8, 1};
		System.out.println("Result: " + solution.lastStoneWeight(test1));
		System.out.println("Input: [2, 7, 4, 1, 8, 1]");
		System.out.println("Output: 1");
		
		int[] test2 = {1, 3};
		System.out.println("Result: " + solution.lastStoneWeight(test2));
		System.out.println("Input: [1, 3]");
		System.out.println("Output: 2");			
				
		int[] test3 = {2, 7, 4, 1, 8, 1};
		System.out.println("Result: " + solution.lastStoneWeight(test3));
		System.out.println("Input: [2, 7, 4, 1, 8, 1]");
		System.out.println("Output: 1");			
		
	
		int[] test4 = {3, 7, 2};
		System.out.println("Result: " + solution.lastStoneWeight(test4));
		System.out.println("Input: [3, 7, 2]");
		System.out.println("Output: 2");		
	}
	
	public int lastStoneWeight(int[] stones) {
    	int result = 0;
    	LinkedList<Integer> stonesList = new LinkedList<Integer>();
    	
    	// Let's sort the array first as a linked list.
    	for (int i = 0; i < stones.length; i++) {
    		stonesList.add(stones[i]);
    	}
    	
    	stonesList.sort(new Comparator<Integer>() {
    	    @Override
            public int compare(Integer o1, Integer o2){
                return o1 >= o2 ? -1 : 1;
            }
        });
    	
		int i = 0;
		int leftOverInt = -1;
		int firstStone = -1;
		int secondStone = -1;
    	while (stonesList.size() >= 1) {
    		System.out.println("i: " + i + ", List: " + stonesList.toString());
    	
    		if (leftOverInt == -1) {
    			firstStone = stonesList.remove(0);
    			secondStone = stonesList.remove(0);
    		} else if (leftOverInt > stonesList.peekFirst()) {
    			firstStone = leftOverInt;
    			secondStone = stonesList.remove(0);
    		} else if (leftOverInt > stonesList.get(1)) {
    			firstStone = stonesList.remove(0);
    			secondStone = leftOverInt;
    		} else {
    			firstStone = stonesList.remove(0);
    			secondStone = stonesList.remove(0);
    			stonesList.add(leftOverInt);
    		}
    		System.out.println("firstStone: " + firstStone + ", secondStone: " + secondStone + ", leftOverInt: " + leftOverInt);
    		
    		if (firstStone != secondStone)
    			leftOverInt = firstStone - secondStone;
    		else
    			leftOverInt = -1;
    		System.out.println("i: " + i + ", List: " + stonesList.toString());
    		i++;
    	}
    	if (leftOverInt > 0)
    		stonesList.add(leftOverInt);
    	
    	if (stonesList.size() == 1)
    		result = stonesList.get(0);
    	
    	return result;
    }
	
    public int lastStoneWeightBruteForce(int[] stones) {
    	int result = 0;
    	LinkedList<Integer> stonesList = new LinkedList<Integer>();
    	
    	// Let's sort the array first as a linked list.
    	for (int i = 0; i < stones.length; i++) {
    		stonesList.add(stones[i]);
    	}
    	
		int i = 0;
    	while (stonesList.size() > 1) {
    		stonesList.sort(new Comparator<Integer>() {
        	    @Override
                public int compare(Integer o1, Integer o2){
                    return o1 >= o2 ? -1 : 1;
                }
            });
    		
    		System.out.println("i: " + i + ", List: " + stonesList.toString());
    	
    		int firstStone = stonesList.remove(0);
    		int secondStone = stonesList.remove(0);
    		System.out.println("firstStone: " + firstStone + ", secondStone: " + secondStone);
    		
    		if (firstStone != secondStone)
    			stonesList.add(firstStone - secondStone);
    		System.out.println("i: " + i + ", List: " + stonesList.toString());
    		i++;
    	}
    	
    	if (stonesList.size() == 1)
    		result = stonesList.get(0);
    	
    	return result;
    }
    

}