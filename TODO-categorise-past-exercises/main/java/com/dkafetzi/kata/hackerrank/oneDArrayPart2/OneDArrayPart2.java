package com.dkafetzi.kata.hackerrank.oneDArrayPart2;

import java.util.*;

public class OneDArrayPart2 {

	static boolean enable_logging = false;
    /*
     * https://www.hackerrank.com/challenges/java-1d-array/problem
     * 
     * The logic that we will try to implement is the following:
     *  * Keep two kind of records
     *  	1. Visited positions
     *      2. Possible next moves
     *  * For each square that we are in
     *      record it as visited and
     *      add into a stack the next possible moves
     *  * If we cannot win at the position we are in
     *    take the next move from the stack
     *  * If the next moves are exhausted, we lose.
     *  
     */
    static boolean canWin(int leap, int[] game) {
    	boolean win = false;
    	
    	int length = game.length;
    	// Record visited positions.
    	int[] visited = new int [length];
    	for (int i = 0; i < length; i++) {
    		visited[i] = 0;
    	}
    	
    	// Record new moves.
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	if(enable_logging) {
    		StringBuffer a = new StringBuffer();
    		for (int i = 0; i < length; i++) {
    			a.append(game[i] + ", ");
    		}
    		System.out.println("Begin: " + leap + ", " + game.length + ": " + a.toString());
    	}
    	
        // Store our initial position.
        int position = 0;
        stack.add(position);
        
        // Loop through the available items in stack and check your choices.
        while (!stack.isEmpty()) {
        	position = stack.pop().intValue();
        	visited[position] = 1;
        	
        	if (position + leap >= length || position == length - 1) {
            	// We can straight jump out of the array.
            	win = true;
            	if(enable_logging)
            		System.out.println("Win: position = " + position + ", leap = " + leap + ", length = " + length + ".");
            	break;
            } else {
            	// Can we jump?
            	if (position + leap < length && visited[position + leap] == 0 && game[position + leap] == 0) {
            		stack.add(position + leap);
            		if(enable_logging)
            			System.out.println("Add leap: position = " + (position + leap) + ", leap = " + leap + ", length = " + length + ".");
            	}
            	// Can we move forwards?
            	if (position + 1 < length && visited[position + 1] == 0 && game[position + 1] == 0) {
            		stack.add(position + 1);
            		if(enable_logging)
            			System.out.println("Add move: position = " + (position + 1) + ", leap = " + leap + ", length = " + length + ".");
            	}
            	// Can we move backwards?
            	if (position - 1 > 0 && visited[position - 1] == 0 && game[position - 1] == 0) {
            		stack.add(position - 1);
            		if(enable_logging)
            			System.out.println("Add move: position = " + (position - 1) + ", leap = " + leap + ", length = " + length + ".");
            	}
            }
        }
                	
    	return win;
    }
}
