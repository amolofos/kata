package com.dkafetzi.kata.hackerrank.diagonalDifference;

public class DiagonalDifference {

	static boolean enable_logging = false;
    /*
     * https://www.hackerrank.com/challenges/diagonal-difference/problem
     */
    static int diagonalDifference(String input) {
    	
        return calculateDifference(parseInput(input));
    }
    
    static int[][] parseInput(String input) {
    	int[][] arr;
    	int length;
    	
    	String[] lines = input.split("\\r?\\n");
    	
    	// The first line is the size of the array.
    	length = Integer.parseInt(lines[0]);
        arr = new int[length][length];

        // Loop through one side of the array.
        for (int i = 0; i < length; i++) {
        	String[] values = lines[i + 1].split(" ");
        	
        	for (int j = 0; j < length; j++) {
            	if(enable_logging)
            		System.out.println("Read: " + i + ", " + values[j] + ".");
            	
        		arr[i][j] = Integer.parseInt(values[j]);
        	}
        }
        
    	return arr;
    }
    
    static int calculateDifference(int[][] arr) {
    	int majorDiagonal = 0;
    	int secodaryDiagonal = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
    		if(enable_logging)
        		System.out.println("Add: " + arr[i][i] + ", " + arr[arr.length - 1 - i][i] + ".");
    		
    		majorDiagonal += arr[i][i];
    		secodaryDiagonal += arr[arr.length - 1 - i][i];
    	}
    	
    	return Math.abs(majorDiagonal - secodaryDiagonal);
    }
}