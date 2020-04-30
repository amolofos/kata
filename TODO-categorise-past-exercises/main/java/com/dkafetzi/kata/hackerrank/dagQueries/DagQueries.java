package com.dkafetzi.kata.hackerrank.dagQueries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import com.dkafetzi.kata.KataSettings;

@Service
public class DagQueries {

	private final static Logger LOGGER = LoggerFactory.getLogger(DagQueries.class);
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = false;
    
    static int MAX_SIZE = 10;
    
    public class Dag {
    	
    	private int width;
    	private int height;
    	
    	// cellDependencies contains all the distinct cells that a cell depends on down to the last leaf.
    	private HashMap<String, HashSet<String>> cellDependencies = new HashMap<String, HashSet<String>>();
    	
    	// cellDependentBy contains all the first level distinct cells that a cell depends on.
    	private HashMap<String, HashSet<String>> cellDependentBy = new HashMap<String, HashSet<String>>();
    	
    	private Stack<String> roots = new Stack<String>();
    	
    	public Dag(int width, int height) {
    		this.width = width;
    		this.height = height;
    	}
    }
    
    
	static private long[] verticesArrayValues;
	static private ArrayList<Integer>[] verticesArrayChildren;
	static private ArrayList<Integer>[] verticesArrayChildrenNoRestrictions;

	/*
	 * https://www.hackerrank.com/challenges/ctci-big-o
	 * https://en.wikipedia.org/wiki/Prime_numberLq g
	 */
	public static String calcNewDag(String input) {
		StringBuilder returnStr = new StringBuilder();
		int vertices = 0;
		int edges = 0;
		int queries = 0;

		initVerticesArrayValues();

		String[] input_lines = input.split("\\r?\\n");

		// Dealing with the first line.
		vertices = Integer.parseInt(input_lines[0].split(" ")[0]);
		edges = Integer.parseInt(input_lines[0].split(" ")[1]);
		queries = Integer.parseInt(input_lines[0].split(" ")[2]);
		if (enableLogging)
			LOGGER.info("Input: vertices " + vertices + ", edges " + edges + ", queries " + queries + ".");

		// For m rows after the first one, we have the DAG definition.
		for (int i = 1; i <= edges; i++) {
			int vertexId_u = Integer.parseInt(input_lines[i].split(" ")[0]);
			int vertexId_v = Integer.parseInt(input_lines[i].split(" ")[1]);

			if (enableLogging)
				LOGGER.info("Input: dealing with vertexId_u " + vertexId_u + ", vertexId_v " + vertexId_v + ".");
						
			if (!verticesArrayChildren[vertexId_u].contains(vertexId_v)) {
				verticesArrayChildren[vertexId_u].add(vertexId_v);
			}
			
			if (enableLogging)
				LOGGER.info("Input: vertexId_u " + vertexId_u + " now has " + verticesArrayChildren[vertexId_u].size() + " children.");
		}
		
		// Since what we want is to parse the array top to bottom, let's pre-calculate
		// the next indexes of a vertex.
		calcVerticesChildrenUntilLeaf();
		
		// Let's print the entire thing.
		if (enableLogging)
			printDAG();

		// For q rows after the DAG definition, we have the queries to perform.
		for (int i = 1 + edges; i <= edges + queries; i++) {
			int queryType = 0;
			int queryVertex = 0;
			int queryValue = 0;

			queryType = Integer.parseInt(input_lines[i].split(" ")[0]);
			queryVertex = Integer.parseInt(input_lines[i].split(" ")[1]);
			if (queryType == 1 || queryType == 2)
				queryValue = Integer.parseInt(input_lines[i].split(" ")[2]);

			if (enableLogging)
				LOGGER.info("Input: dealing with query_type " + queryType + ", query_vertex " + queryVertex
						+ ", query_value " + queryValue + ".");

			switch (queryType) {
			case 1:
				// 1 u x: Set au to x for all such that there is a path in the DAG from u to v.
				updateVerticesMap(queryVertex, queryValue);
				break;
			case 2:
				// 2 u x: Set au to x for all such that there is a path from u to v and au > x.
				updateVerticesMapWithRestriction(queryVertex, queryValue);
				break;
			case 3:
				// 3 u: Print the value of au on a new line.
				if (enableLogging) {
					LOGGER.info("Calc: query_type " + queryType + ", printing value "
							+ verticesArrayValues[queryVertex] + ".");
					System.out.println(verticesArrayValues[queryVertex]);
				}
				returnStr.append(verticesArrayValues[queryVertex] + "\n");

				break;
			default:
				// Do nothing, not even error for now.
				break;
			}
		}

		return returnStr.toString().trim();
	}

	@SuppressWarnings("unchecked")
	private static void initVerticesArrayValues() {
		verticesArrayValues = new long[MAX_SIZE];
		verticesArrayChildren = (ArrayList<Integer>[]) new ArrayList[MAX_SIZE];
		verticesArrayChildrenNoRestrictions = (ArrayList<Integer>[]) new ArrayList[MAX_SIZE];

		for (int i = 0; i < MAX_SIZE; i++) {
			verticesArrayValues[i] = 0;
			verticesArrayChildren[i] = new ArrayList<Integer>();
			verticesArrayChildrenNoRestrictions[i] = new ArrayList<Integer>();
		}
	}
	
	private static void calcVerticesChildrenUntilLeaf() {
		if (enableLogging)
			LOGGER.info("Calc: started finding children.");
		
		// Let's calculate the list of full children tree
		// starting from the smallest ones.
		for (int i = 0; i < MAX_SIZE; i++) {
		//	if (enableLogging)
		//		LOGGER.info("Calc: finding children for size " + i + ".");
			
			for (int j = 0; j < MAX_SIZE; j++) {
		//		if (enableLogging)
		//			LOGGER.info("Calc: finding children for size " + i + " against child " + j + ".");
				
				if (i == 0 && verticesArrayChildren[j].size() == i) {
					if (enableLogging)
						LOGGER.info("Calc: setting empty children size for " + j + ".");
					
					verticesArrayChildrenNoRestrictions[j] = new ArrayList<Integer>();
					continue;
				}
			
				if (verticesArrayChildren[j].size() == i) {
					verticesArrayChildrenNoRestrictions[j] = findVerticesChildrenUntilLeaf(j);

					if (enableLogging)
						LOGGER.info("Calc: found " + verticesArrayChildrenNoRestrictions[j].size() + " children for " + j + ".");
				}
			}
		}
		
		if (enableLogging)
			LOGGER.info("Calc: finished finding children.");
	}
	
	private static ArrayList<Integer> findVerticesChildrenUntilLeaf(int vertex) {
		ArrayList<Integer> children = new ArrayList<Integer>();
		
		for (int v : verticesArrayChildren[vertex]) {
			children.add(v);
			children.addAll(verticesArrayChildrenNoRestrictions[v]);
		}
		return children;
	}
	
	private static void updateVerticesMap(int originVertex, int newValue) {
		// 1 u x: Set au to x for all such that there is a path in the DAG from u to v.

		if (enableLogging)
			LOGGER.info("Calc: started updating vertex " + originVertex + ".");
				
		verticesArrayValues[originVertex] = newValue;
		for (int v : verticesArrayChildrenNoRestrictions[originVertex]) {
			verticesArrayValues[v] = newValue;
		}
		
		if (enableLogging)
			LOGGER.info("Calc: finished updating vertex " + originVertex + ".");
	}

	private static void updateVerticesMapWithRestriction(int originVertex, int newValue) {
		// 2 u x: Set au to x for all such that there is a path from u to v and au > x.

		if (enableLogging)
			LOGGER.info("Calc: start updating vertex " + originVertex + ".");
		
		if (verticesArrayValues[originVertex] > newValue) {
			verticesArrayValues[originVertex] = newValue;
		}

		for (int v : verticesArrayChildrenNoRestrictions[originVertex]) {
			if (verticesArrayValues[v] > newValue) {
				verticesArrayValues[v] = newValue;
			}
		}
		
		if (enableLogging)
			LOGGER.info("Calc: finished updating vertex " + originVertex + ".");
	}

	public static void printDAG() {
		for (int i = 1; i < verticesArrayValues.length; i++) {
			LOGGER.info("Map: key " + i  + ", value " + verticesArrayValues[i] + ", next vertices "
					+ verticesArrayChildrenNoRestrictions[i].toString() + ".");
		};
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		StringBuilder str = new StringBuilder();

		String line = scanner.nextLine();
		str.append(line + "\n");

		int edges = Integer.parseInt(line.split(" ")[1]);
		int queries = Integer.parseInt(line.split(" ")[2]);
		for (int i = 1; i <= edges + queries; i++) {
			str.append(scanner.nextLine() + "\n");
		}
		scanner.close();

		calcNewDag(str.toString().trim());
	}

}