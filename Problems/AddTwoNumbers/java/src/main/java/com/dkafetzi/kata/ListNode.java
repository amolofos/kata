package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListNode implements Cloneable {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(ListNode.class);

	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null)
        	return false;
        
        if ((obj instanceof ListNode) == false)
        	return false;
      
    	ListNode other = (ListNode) obj;
    	
    	LOGGER.info("Comparing {} with {} and {} with {}.", this.val, other.val, this.next, other.next);
    	if (this.val != other.val)
    		return false;
    	
    	if (this.next != null && other.next == null)
    		return false;
    	if (this.next == null && other.next != null)
    		return false;
    	
    	if (this.next != null && other.next != null)
    		return this.next.equals(other.next);

        return true;
    }
    
    @Override
    public ListNode clone() {
    	ListNode c = new ListNode(this.val);
    	
    	if (this.next != null)
    		c.next = this.next.clone();
    	
		return c;
    }
  
	@Override
	public String toString() {
		String s = "[" + val;
		
		ListNode tmp = next;
		while (tmp != null) {
			s += "," + tmp.val;
			tmp = tmp.next;
		}
		
		s += "]";
		return s;
	}
}