package LeetCodeDay3;

public class LeetCodeDay3 {

    public static void main(String[] args) throws Exception {
    	int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    	System.out.println("First: " + maxSubArrayFirst(array));
    	System.out.println("First: " + maxSubArraySecond(array));
    }
    
    public static int maxSubArraySecond(int[] nums) {
    	int result = 0;
    	
    	return result;
    }
	
    public static int maxSubArrayFirst(int[] nums) {
        int r = Integer.MIN_VALUE;
        for(int c = 0, p = 0, i = 0; i < nums.length; i++) {
            c = Math.max(p, 0) + nums[i];
            r = Math.max(c, r);
            p = c;
        }
        return r;
    }
}