package LeetCodeDay1;

import java.util.HashMap;

public class LeetCodeDay1 {

    public static void main(String[] args) throws Exception {
    		int [] t1 = {2,2,1};
    		int [] t2 = {4,1,2,1,2};
    		int v;
    		
    		System.out.println("Hello World");
    		
    		v = singleNumberNoMemory(t1);
    		System.out.println("1: " + v);
    		
    		v = singleNumberNoMemory(t2);
    		System.out.println("2: " + v);
    }
    
    public static int singleNumber(int[] nums) {
        int single = -1;
        
        HashMap<Integer, Integer> occurences = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(occurences.containsKey(nums[i])) {
                occurences.remove(nums[i]);
            } else {
                occurences.put(nums[i], 1);
            }
        }
        
        single = occurences.keySet().hashCode();
        return single;
    }
    
    public static int singleNumberNoMemory(int[] nums) {
        int sum_half = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum_half += nums[i] / 2;
        }
        
        return sum_half;
 }
}