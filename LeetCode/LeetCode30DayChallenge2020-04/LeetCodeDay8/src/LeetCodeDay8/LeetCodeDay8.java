package LeetCodeDay8;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3290/
 * 
 * Given a non-empty, singly linked list with head node "head", return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 * 
 * Example 1:
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * 
 * Example 2:
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 * 
 * Note:
 * The number of nodes in the given list will be between 1 and 100.
 * 
 */
public class LeetCodeDay8 {
	
	public static void main (String[] args) {
		LeetCodeDay8 solution = new LeetCodeDay8();
		
    	System.out.println("Result: " + solution.middleNodeTest1().val);
    	System.out.println("Input: [1, 2, 3, 4, 5]");
    	System.out.println("Output: 3");
    	
    	System.out.println("Result: " + solution.middleNodeTest2().val);
    	System.out.println("Input: [1, 2, 3, 4, 5, 6]");
    	System.out.println("Output: 4");
	}
	
	/*
	 * [1, 2, 3, 4, 5]
     * normalSpeedCounter     runningNode        halfSpeedNode       
     *    begin 1, end 2      begin 1, end 2        1
     *    begin 2, end 3      begin 2, end 3        2 (head + 1)
     *    begin 3, end 4      begin 3, end 4        2
     *    begin 4, end 5      begin 4, end 5        3 (head + 2)
     *    begin 5, end 5      begin 5, end 5        3
     */
	public ListNode middleNodeTest1() {
		ListNode test1 = new ListNode(1);
		
		test1.next = new ListNode(2);
		test1.next.next = new ListNode(3);
		test1.next.next.next = new ListNode(4);
		test1.next.next.next.next = new ListNode(5);
		
		return middleNode(test1);
	}
	   
	 /*
	  * [1, 2, 3, 4, 5, 6]
	  * normalSpeedCounter     runningNode        halfSpeedNode       
      *  begin 1, end 2        begin 1, end 2        1
      *  begin 2, end 3        begin 2, end 3        2 (head + 1)
      *  begin 3, end 4        begin 3, end 4        2
      *  begin 4, end 5        begin 4, end 5        3 (head + 2)
      *  begin 5, end 6        begin 5, end 6        3
      *  begin 6, end 6        begin 6, end 6        4 (head + 3)
	  */
	public ListNode middleNodeTest2() {
		ListNode test2 = new ListNode(1);
		
		test2.next = new ListNode(2);
		test2.next.next = new ListNode(3);
		test2.next.next.next = new ListNode(4);
		test2.next.next.next.next = new ListNode(5);
		test2.next.next.next.next.next = new ListNode(6);

		return middleNode(test2);
	}
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public ListNode middleNode(ListNode head) {
		ListNode result = null;
		
		if (head == null)
			return result;
		
		if (head.next == null)
			return head;
		
		ListNode runningNode = head;
		ListNode halfSpeedNode = head;
		int normalSpeedCounter = 1;
		
		while (true) {
			
			if (normalSpeedCounter % 2 == 0) {
				halfSpeedNode = halfSpeedNode.next;
			}
			
			if (runningNode.next == null)
				break;
			
			normalSpeedCounter++;
			runningNode = runningNode.next;
		}
		
		result = halfSpeedNode;
		
		return result;
	}
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}