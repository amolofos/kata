package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public ListNode addTwoNumbersOnOn(ListNode l1, ListNode l2) {
		ListNode firstN = l1;
        ListNode secondN = l2;
        ListNode finalN = new ListNode(0);
        ListNode resultN = finalN;
        int carry = 0;
        int current = 0;

        while (firstN != null || secondN != null) {
            
            current = carry;
            carry = 0;
            if (firstN != null) {
            	LOGGER.info("Dealing with first: {}.", firstN.val);
            	current += firstN.val;
            	firstN = firstN.next;
            }

            if (secondN != null) {
            	LOGGER.info("Dealing with second: {}.", secondN.val);
            	current += secondN.val;
            	secondN = secondN.next;
            }
            
            if (current >= 10) {
            	carry = current / 10;
                current = current % 10;
            	LOGGER.info("Dealing with carry: {}, current: {}.", carry, current);
            }
            
            finalN.next = new ListNode(current);
            finalN = finalN.next;
        }

        if (carry != 0)
        	finalN.next = new ListNode(carry);        

		return resultN.next;
	}
	
	public ListNode addTwoNumbersOnO1(ListNode firstN, ListNode secondN) {
        ListNode resultN = firstN;
        ListNode prev = null;
        int carry = 0;
        int current = 0;

        if (firstN == null) return secondN;
        if (secondN == null) return firstN;

        while (firstN != null || secondN != null) {
            
            current = carry;
            carry = 0;
            if (firstN != null) {
            	LOGGER.info("Dealing with first: {}.", firstN.val);
            	current += firstN.val;
            }

            if (secondN != null) {
            	LOGGER.info("Dealing with second: {}.", secondN.val);
            	current += secondN.val;
            	secondN = secondN.next;
            }
            
            if (current >= 10) {
            	carry = current / 10;
                current = current % 10;
            	LOGGER.info("Dealing with carry: {}, current: {}.", carry, current);
            }
            
            if (firstN == null) {
            	prev.next = new ListNode(current);  
            	firstN = prev.next;
            }
            else
            	firstN.val = current;
            LOGGER.info("Dealing with firstN: {}.", firstN);
            
            prev = firstN;
            firstN = firstN.next;
        }

        if (carry != 0)
        	prev.next = new ListNode(carry);

		return resultN;
	}
}
