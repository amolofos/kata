package LeetCodeDay2;

import java.util.HashSet;

public class LeetCodeDay2 {

    public static void main(String[] args) {
    	System.out.println("0: " + isHappyV1(0));
    	System.out.println("19: " + isHappyV1(19));
    	System.out.println("99: " + isHappyV1(99));
    }

    public static boolean isHappyV1(int n) {
        HashSet<Integer> seen = new HashSet<Integer>(); 
        boolean result = true;
    	
    	int sum = n;
    	while (result && sum != 1) {
        	
    		int temp = 0;
    		int mod = 0;
    		while (sum > 0) {
    			mod = sum % 10;
    			temp += mod * mod;
    		    sum = sum / 10;
    		}
    		sum = temp;
    		
    		// Here is an alternative way but slower.
    		// sum = Integer.toString(sum).chars().map(c -> (c-'0') * (c-'0')).sum();
        	
    		if (seen.contains(sum))
    			result = false;
    		
    		seen.add(sum);
    	}
    	
    	return result;
    }
}