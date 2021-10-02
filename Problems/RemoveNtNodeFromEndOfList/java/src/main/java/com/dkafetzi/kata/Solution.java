package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public ListNode removeNthFromEndPass2(ListNode head, int n) {
		ListNode runningNode = head;
		ListNode previousNode = head;

		int size = 0;
		while (runningNode != null) {
			runningNode = runningNode.next;
			size++;
		}
		LOGGER.info("size: {}.", size);

		int indexToRemove = size - n;

		// Remove the first element.
		if (indexToRemove == 0) {
			return head.next;
		}

		runningNode = head;
		previousNode = head;
		for (int i = 0; i <= indexToRemove; i++) {
			LOGGER.info("i: {}.", i);
			if (i == indexToRemove) {
				LOGGER.info("i: {}, indexToRemove: {}.", i, indexToRemove);
				previousNode.next = runningNode.next;
				break;
			}
			previousNode = runningNode;
			runningNode = runningNode.next;
		}

		return head;
	}

	public ListNode removeNthFromEndPass1(ListNode head, int n) {
		ListNode runningNodeSlow = head;
		ListNode runningNodeFast = head;
		int counter = 0;

		while (runningNodeFast != null) {
			counter++;

			runningNodeFast = runningNodeFast.next;
			if (counter > n + 1) {
				runningNodeSlow = runningNodeSlow.next;
			}

			LOGGER.info("counter: {}, runningNodeFast: {}, runningNodeSlow: {}", counter, runningNodeFast, runningNodeSlow);
		}

		if (runningNodeSlow.next == null)
			return runningNodeSlow.next;

		if (counter == n)
			return head.next;

		runningNodeSlow.next = runningNodeSlow.next.next;

		return head;
	}
}
