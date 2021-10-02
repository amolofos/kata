package com.dkafetzi.kata;

public class ListNode implements Cloneable {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }

	public String toString() {
		return val + "";
	}

	public ListNode clone() {
		ListNode result = new ListNode();

		try {
			result = (ListNode) super.clone();
			if (result.next != null)
				result.next = result.next.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
    }
}
