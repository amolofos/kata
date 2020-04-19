package com.dkafetzi.kata;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryMatrix {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(BinaryMatrix.class);
	
	private int[][] matrix = {};
	private int getCounter = 0;
	
	public BinaryMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public int get(int x, int y) {
		this.getCounter++;
		
		//LOGGER.debug("Returning: x: {}, y: {}, value: {}", x, y, this.matrix[x][y]);
		return this.matrix[x][y];
	}
	
	public int getGetCounter() {
		return this.getCounter;
	}
	
	public List<Integer> dimensions() {
		ArrayList<Integer> dimensions = new ArrayList<Integer>();
		
		int x = 0;
		int y = 0;
		
		if (this.matrix.length > 0) {
			x = this.matrix.length;
			
			if (this.matrix[0].length > 0) {
				y = this.matrix[0].length;
			}
		}
		
		dimensions.add(x);
		dimensions.add(y);
		
		return dimensions;
	}
}