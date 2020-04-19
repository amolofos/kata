package LeetCodeDay10;

import java.util.LinkedList;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3292/
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x)  -- Push element x onto stack.
 * pop()    -- Removes the element on top of the stack.
 * top()    -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * 
 */
public class MinStack {
	int min = Integer.MIN_VALUE;
	
	LinkedList<Integer> stack = new LinkedList<Integer>();
	
	public static void main (String[] args) {
		MinStack minStack = new MinStack();

		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println("Expected: -3, Result: " + minStack.getMin());		
		minStack.pop();
		System.out.println("Expected: 0, Result: " + minStack.top());
		System.out.println("Expected: -2, Result: " + minStack.getMin());
	}

	/** initialize your data structure here. */
	public MinStack() {
		this.min = Integer.MAX_VALUE;
        
	}
    
	public void push(int x) {
		if (x < this.min)
			this.min = x;
		
		this.stack.add(x);
		
		printStack();
	}
    
	public void pop() {
		int toRemoveInt = this.stack.removeLast();
		System.out.println("Removing: " + toRemoveInt);
		
		// We need to calculate the min again.
		if (this.min == toRemoveInt) {
			this.min = Integer.MAX_VALUE;
			for (int i = 0; i < this.stack.size(); i++) {
				int temp = this.stack.get(i);
				System.out.println("Min: " + this.min + ", i: " + i + ", temp: " + temp);
				if (temp < this.min)
					this.min = temp;
			}
		}
		printStack();
	}
    
	public int top() {
        int top = this.stack.getLast();
        
        printStack();
        
        return top;
	}
    
	public int getMin() {
        return this.min;
	}
	
	public void printStack() {
		for (int i = 0; i < this.stack.size(); i++)
			System.out.println("i: " + i + ", " + this.stack.get(i));
	}
	
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}