package LeetCodeDay14;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3299/
 * 
 * You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:
 * direction can be 0 (for left shift) or 1 (for right shift). 
 * amount is the amount by which string s is to be shifted.
 * A left shift by 1 means remove the first character of s and append it to the end.
 * Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
 * 
 * Return the final string after all operations.
 * 
 * Example 1:
 * Input: s = "abc", shift = [[0,1],[1,2]]
 * Output: "cab"
 * Explanation: 
 * [0,1] means shift to left by 1. "abc" -> "bca"
 * [1,2] means shift to right by 2. "bca" -> "cab"
 * 
 * Example 2:
 * Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
 * Output: "efgabcd"
 * Explanation:  
 * [1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
 * [1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
 * [0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
 * [1,3] means shift to right by 3. "abcdefg" -> "efgabcd"
 * 
 * Constraints:
 * 1 <= s.length <= 100
 *  s only contains lower case English letters.
 *  1 <= shift.length <= 100
 *  shift[i].length == 2
 *  0 <= shift[i][0] <= 1
 *  0 <= shift[i][1] <= 100
 * 
 */
public class LeetCodeDay14 {
	
	public static void main (String[] args) {
		LeetCodeDay14 solution = new LeetCodeDay14();
		
		int [][] test1 = { {0, 1}, {1, 2} };
		System.out.println("Result: " + solution.stringShift("abc", test1));
		System.out.println("Input: \"abc\", { {0, 1}, {1, 2} }");
		System.out.println("Output: \"cab\"");
		
		int [][] test2 = { {1, 1}, {1, 1}, {0, 2}, {1, 3} };
		System.out.println("Result: " + solution.stringShift("abcdefg", test2));
		System.out.println("Input: \"abcdefg\", { {1, 1}, {1, 1}, {0, 2}, {1, 3} }");
		System.out.println("Output: \"efgabcd\"");
		
		int [][] test3 = { {1, 4}, {0, 5}, {0, 4}, {1, 1}, {1, 5} };
		System.out.println("Result: " + solution.stringShift("mecsk", test3));
		System.out.println("Input: \"mecsk\", { {1, 4}, {0, 5}, {0, 4}, {1, 1}, {1, 5} }");
		System.out.println("Output: \"kmecs\"");
		
		int [][] test4 = { {1, 1}, {1, 6}, {0, 1}, {1, 3}, {1, 0}, {0, 3} };
		System.out.println("Result: " + solution.stringShift("joiazl", test4));
		System.out.println("Input: \"joiazl\", { {1, 1}, {1, 6}, {0, 1}, {1, 3}, {1, 0}, {0, 3} }");
		System.out.println("Output: \"kmecs\"");
	}
	
    public String stringShift(String s, int[][] shift) {        
        int strHead = 0;
        char[] str = s.toCharArray();
        
        int direction = 0;
        int amount = 0;
        for (int i = 0; i < shift.length; i++) {
        	direction = shift[i][0];
        	amount = shift[i][1];
        	
        	System.out.println("i: " + i + ", strHead: " + strHead + ", direction: " + direction + ", amount: " + amount);
        	
        	// Direction: 0 for left shift, 1 for right shift.
        	if (direction == 0) {
        		// We know that a shift can fit into the entire array since
        		// 0 <= shift[i][1] <= 100
        		if (str.length - strHead - amount > 0) {
        			strHead += amount;
        		} else {
        			strHead = Math.abs(str.length - strHead - amount);
        		}
        	} else {
        		if (strHead - amount >= 0) {
        			strHead -= amount;
        		} else {
        			strHead = str.length - Math.abs(strHead - amount);
        		}
        	}
        	
        	System.out.println("i: " + i + ", strHead: " + strHead + ", direction: " + direction + ", amount: " + amount);
        }
        
        StringBuffer strResult = new StringBuffer();
        while (str[strHead] != '0') {
        	System.out.println("strHead: " + strHead + ", str[strHead]: " + str[strHead]); 
        	strResult.append(str[strHead]);
        	
        	str[strHead] = '0';
        	strHead++;
        	if (strHead >= str.length)
        		strHead = 0;
        }
        
        return strResult.toString();
    }
}