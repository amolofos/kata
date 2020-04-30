package LeetCodeDay9;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3291/
 * 
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 * 
 * Example 1:
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * 
 * Example 2:
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * 
 * Example 3:
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * 
 * Example 4:
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * 
 * Note:
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * 
 * Follow up:
 *   Can you solve it in O(N) time and O(1) space?
 * 
 */
public class LeetCodeDay9 {
	
	public static void main (String[] args) {
		LeetCodeDay9 solution = new LeetCodeDay9();
		
    	System.out.println("Result: " + solution.backspaceCompare("ab#c", "ab#c"));
    	System.out.println("Input: \"ab#c\", \"ab#c\"");
    	System.out.println("Output: true");
    	
    	System.out.println("Result: " + solution.backspaceCompare("ab##", "c#d#"));
    	System.out.println("Input: \"ab##\", \"c#d#\"");
    	System.out.println("Output: true");
    	
    	System.out.println("Result: " + solution.backspaceCompare("a##c", "#a#c"));
    	System.out.println("Input: \"a##c\", \"#a#c\"");
    	System.out.println("Output: true");

    	System.out.println("Result: " + solution.backspaceCompare("a#cc", "b"));
    	System.out.println("Input: \"a#c\", \"b\"");
    	System.out.println("Output: false");
    	
    	System.out.println("Result: " + solution.backspaceCompare("bxj##tw", "bxo#j##tw"));
    	System.out.println("Input: \"bxj##tw\", \"bxo#j##tw\"");
    	System.out.println("Output: true");
    	
    	System.out.println("Result: " + solution.backspaceCompare("bxj##tw", "bxj###tw"));
    	System.out.println("Input: \"bxj##tw\", \"bxj###tw\"");
    	System.out.println("Output: false");
	}
	
    public boolean backspaceCompare(String S, String T) {
    	int sIndex = S.length() - 1;
    	int tIndex = T.length() - 1;
    	    	
    	char sChar = ' ';
		char tChar = ' ';
		int sSkip = 0;
		int tSkip = 0;
		
    	System.out.println("1: sIndex: " + sIndex + ", tIndex: " + tIndex + ", sChar: " + sChar + ", tChar: " + tChar + ", sSkip: " + sSkip + ", tSkip: " + tSkip);
		
		while (sIndex >= 0 || tIndex >= 0) {
		
			sChar = ' ';
			tChar = ' ';

	    	System.out.println("2: sIndex: " + sIndex + ", tIndex: " + tIndex + ", sChar: " + sChar + ", tChar: " + tChar + ", sSkip: " + sSkip + ", tSkip: " + tSkip);
	    	
			if (sIndex >=0 ) {
				sChar = S.charAt(sIndex);
			}
			if (tIndex >= 0) {
				tChar = T.charAt(tIndex);
			}
			
	    	System.out.println("3: sIndex: " + sIndex + ", tIndex: " + tIndex + ", sChar: " + sChar + ", tChar: " + tChar + ", sSkip: " + sSkip + ", tSkip: " + tSkip);

    		if (sChar == '#') {
    			sSkip++;
    			sIndex--;
    			if (sIndex < 0)
    				sChar = ' ';
    			continue;
    		}
    		
	    	System.out.println("4: sIndex: " + sIndex + ", tIndex: " + tIndex + ", sChar: " + sChar + ", tChar: " + tChar + ", sSkip: " + sSkip + ", tSkip: " + tSkip);

    		if (tChar == '#') {
    			tSkip++;
    			tIndex--;
    			if (tIndex < 0)
    				tChar = ' ';
    			continue;
			}
    		
	    	System.out.println("5: sIndex: " + sIndex + ", tIndex: " + tIndex + ", sChar: " + sChar + ", tChar: " + tChar + ", sSkip: " + sSkip + ", tSkip: " + tSkip);

    		if (sSkip > 0) {
    			sIndex--;
    			sSkip--;
    			if (sIndex < 0)
    				sChar = ' ';
    			continue;
    		}
    		
	    	System.out.println("6: sIndex: " + sIndex + ", tIndex: " + tIndex + ", sChar: " + sChar + ", tChar: " + tChar + ", sSkip: " + sSkip + ", tSkip: " + tSkip);

    		if (tSkip > 0) {
    			tIndex--;
    			tSkip--;
    			if (tIndex < 0)
    				tChar = ' ';
    			continue;
    		}
    		
	    	System.out.println("7: sIndex: " + sIndex + ", tIndex: " + tIndex + ", sChar: " + sChar + ", tChar: " + tChar + ", sSkip: " + sSkip + ", tSkip: " + tSkip);
			
	    	// At this point we have two characters to compare.
			if (sChar != tChar) {
				break;
			}
			
			sIndex--;
			tIndex--;
    	}

		return sChar == tChar;
    }
}