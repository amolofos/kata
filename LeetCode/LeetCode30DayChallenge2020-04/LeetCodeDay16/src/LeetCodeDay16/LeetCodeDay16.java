package LeetCodeDay16;

import java.util.Stack;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3301/
 * 
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 * 
 * Example 1:
 * Input: "()"
 * Output: True
 * 
 * Example 2:
 * Input: "(*)"
 * Output: True
 * 
 * Example 3:
 * Input: "(*))"
 * Output: True
 * 
 * Note:
 * The string size will be in the range [1, 100].
 * 
 */
public class LeetCodeDay16 {
	
	public static void main (String[] args) {
		LeetCodeDay16 solution = new LeetCodeDay16();
		
		String test1 = "()";
		System.out.println("Result: " + solution.checkValidStringWrapper(test1));
		System.out.println("Input: " + test1);
		System.out.println("Output: true");
	
		String test2 = "(*)";
		System.out.println("Result: " + solution.checkValidStringWrapper(test2));
		System.out.println("Input: " + test2);
		System.out.println("Output: true");
		
		String test3 = "(*))";
		System.out.println("Result: " + solution.checkValidStringWrapper(test3));
		System.out.println("Input: " + test3);
		System.out.println("Output: true");
		
		String test4 = "(*())))";
		System.out.println("Result: " + solution.checkValidStringWrapper(test4));
		System.out.println("Input: " + test4);
		System.out.println("Output: false");
		
		String test5 = ")(";
		System.out.println("Result: " + solution.checkValidStringWrapper(test5));
		System.out.println("Input: " + test5);
		System.out.println("Output: false");
		
		String test6 = "(((******))";
		System.out.println("Result: " + solution.checkValidStringWrapper(test6));
		System.out.println("Input: " + test6);
		System.out.println("Output: true");
	
		String test7 = "(())((())()()(*)(*()(())())())()()((()())((()))(*";
		System.out.println("Result: " + solution.checkValidStringWrapper(test7));
		System.out.println("Input: " + test7);
		System.out.println("Output: false");
	
		String test8 = "(()(()))(()()()))))((((()*()*(())())(()))((*()(*((*(*()))()(())*()()))*)*()))()()(())()(()))()))) ";
		System.out.println("Result: " + solution.checkValidStringWrapper(test8));
		System.out.println("Input: " + test8);
		System.out.println("Output: false");

	}
	
	
    public boolean checkValidStringWrapper(String s) {
    	return checkValidString(s);
    }
    
    /*
     * Complexity:
     * Time:
     *  One pass: O(n)
     *  Pass until stack is empty: O(n)
     *  Total: O(2n) => O(n)
     * Space:
     * 
     */
    public boolean checkValidString(String s) {
    	boolean result = true;
    	    	
    	int total = 0;
    	int asterix = 0;
    	for (int i = s.length() - 1; i >= 0; i--) {
    		char c = s.charAt(i);
    		
    		System.out.println("i: " + i + ", c: " + c + ", total: " + total + ", asterix: " + asterix);
    		
    		switch (c) {
    			case ')': {
    				total++;
    				break;
    			}
    			case '(': {
    				total--;
    				break;
    			}
    			case '*': {
    				asterix++;
    				break;
    			}
    			default: {
    				// do nothing
    				break;
    			}
    		}
    		
    		//if (total == 0) {
    		//	asterix = 0;
    		//}
    		
    		if (total < 0 && asterix > 0) {
    			total = 0;
    			asterix--;
    		}
    		
    		System.out.println("i: " + i + ", c: " + c + ", total: " + total + ", asterix: " + asterix);
    		if (total < 0) {
    			result = false;
    			break;
    		}
    		
    	}
    	
    	if (total > 0 && total > asterix) {
    		result = false;
    	}

    	return result;
    }
}