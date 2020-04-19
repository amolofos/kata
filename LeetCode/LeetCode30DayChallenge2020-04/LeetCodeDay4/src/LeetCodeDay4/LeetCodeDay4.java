package LeetCodeDay4;

/*
 * Input:  [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCodeDay4 {

    public static void main(String[] args) {
    	int[] array1 = {0, 1, 0, 3, 12};
    	moveZeroesV2(array1);
    	System.out.println("Input:   [0, 1, 0, 3, 12]");
    	System.out.println("Outpout: [1, 3, 12, 0, 0]");
    	
    	int[] array2 = {0, 0, 1};
    	moveZeroesV2(array2);
    	System.out.println("Input:   [0, 0, 1]");
    	System.out.println("Outpout: [1, 0, 0]");
    }
 
    public static void moveZeroesV2(int[] nums) {   	
    	int l = nums.length;
    	int i = 0;
    	
    	while (i < l) {
    		System.out.println("pre: " + Arrays.toString(nums));

    		if (nums[i] == 0) {
    			int j = i + 1;
    			while (j < l) {
    				if (nums[j] == 0) {
    					j++;
    					continue;
    				}

    				nums[i] = nums[j];
    				nums[j] = 0;
    				j++;
    				i++;
    			}
    		}
    		
    		i++;
    		
        	System.out.println("post: " + Arrays.toString(nums));
    	}
    
    	System.out.println("Calc:    " + Arrays.toString(nums));
    }
    	/*
    	for (int i = 0; i < nums.length; i++) {
        	System.out.println("pre: " + Arrays.toString(nums));

    		if (nums[i] == 0) {
    			int j = i + 1;
    			int current = i;
    			boolean previousZero = true;
    			while (j < nums.length && previousZero) {
    				if (nums[j] == 0) {
    					j++;
    					continue;
    				}
    				previousZero = false;
    				nums[current] = nums[j];
    				nums[j] = 0;
    				j++;
    				current++;
    			}
    		}
        	System.out.println("post: " + Arrays.toString(nums));
    	}
	
    	System.out.println("Calc:    " + Arrays.toString(nums));
    }
*/    
    
    public static void moveZeroesV1(int[] nums) {
    	Queue<Integer> pending = new LinkedList<Integer>();
    	
    	int nonZero = 0;
    	int zero = 0;

    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] != 0) {
    			pending.add(nums[i]);
    			nonZero++;
    		}
    		
    		if (nums[i] == 0)
    			zero++;
    		
        	System.out.println(i + ": " + nonZero + ", " + zero + ", " + pending.size());
       	}

    	System.out.println(nonZero + ", " + zero + ", " + pending.size());
    	
    	for (int i = 0; i < nonZero; i++) {
    		nums[i] = (int) pending.remove();
        	System.out.println(i + ": " + nums[i]);
    	}
    	System.out.println("---");
    	for (int i = nonZero; i < nums.length; i++) {
        	nums[i] = 0;
        	System.out.println(i + ": " + nums[i]);
    	}

    	System.out.println(Arrays.toString(nums));
    }
}

/*
[0, 1, 0, 3, 12]		
i | nonZero | zero | nums
0 |    -1   |  0   | [0, 1, 0, 3, 12]		
1 |     0   |  1   | [1, 0, 0, 3, 12]
2 |     




*/