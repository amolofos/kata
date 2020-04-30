package com.dkafetzi.kata.hackerrank.javaList;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

    /*
     * https://www.hackerrank.com/challenges/java-list/problem 
     */
    static String operateOnList(String input) {
    	boolean enable_logging = false;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	// Let's parse input line by line.
    	String[] lines = input.split("\\r?\\n");
    	
    	String[] numbers = lines[1].split(" ");
    	for (int i = 0; i < numbers.length; i++) {
    		list.add(Integer.parseInt(numbers[i]));
    	}
    	
    	int operations = Integer.parseInt(lines[2]);
    	for (int i = 3; i < (operations * 2 + 3); i += 2) {
    		String operation = lines[i];
    		String value = lines[i + 1];
    		
        	if(enable_logging)
        		System.out.println("Op: " + operation + " with value = " + value + ".");
    		
    		switch (operation) {
    			case "Insert":
    	        	if(enable_logging)
    	        		System.out.println("Op Insert: " + value.split(" ")[0] + ", " + value.split(" ")[1] + ".");
    				list.add(
    						Integer.parseInt(value.split(" ")[0]),
    						Integer.parseInt(value.split(" ")[1])
    				);
    				break;
    			case "Delete":
    	        	if(enable_logging)
    	        		System.out.println("Op Delete: " + Integer.parseInt(value) + ".");
    				list.remove(Integer.parseInt(value));
    				break;
    			default:
    				// Do nothing.
    		}
    	}
    	
    	return list.toString().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll(",", "");
    }
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	StringBuilder input = new StringBuilder();
    	
        while(in.hasNextLine()){
        	input.append(in.nextLine() + "\n");
        }
        
        System.out.println(operateOnList(input.toString()));
        in.close();
    }
}