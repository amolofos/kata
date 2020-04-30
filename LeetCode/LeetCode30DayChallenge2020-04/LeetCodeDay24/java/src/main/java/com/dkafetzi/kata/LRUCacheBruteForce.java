package com.dkafetzi.kata;

import java.util.HashMap;
import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LRUCacheBruteForce extends LRUCache {

	private final static Logger LOGGER = LoggerFactory.getLogger(LRUCacheBruteForce.class);
	
	protected HashMap<Integer, Integer> cache;
	protected LinkedList<Integer> frequency;
	
    public LRUCacheBruteForce(int capacity) {
        super(capacity);
        
        this.cache = new HashMap<Integer, Integer>();
        this.frequency = new LinkedList<Integer>();
    }
    
    public int get(int key) {
        int result = -1;

    	LOGGER.debug("Get: key: {}.", key);

        if (this.cache.containsKey(key)) {
        	result = this.cache.get(key);
        	
        	LOGGER.debug("Get: moving key: {}", key);
        	this.frequency.remove(this.frequency.indexOf(key));
        	this.frequency.add(0, key);
        }
        
    	LOGGER.debug("Get: key: {}, result: {}.", key, result);

        return result;
    }
    
    public void put(int key, int value) {
    	LOGGER.debug("Put: key: {}, value: {}.", key, value);
        
    	if (!this.cache.containsKey(key)) {
    		// Evict.
    		if (this.cache.size() >= this.maxCapacity && !this.cache.isEmpty()) {
    			int leastUsed = this.frequency.get(this.maxCapacity - 1);
    			LOGGER.debug("Put: removing key: {}.", leastUsed);

    			this.cache.remove(leastUsed);
    			this.frequency.remove(this.maxCapacity - 1);
    		}
    	}
    	
    	// Store the new item.
    	LOGGER.debug("Put: adding key: {}, value: {}.", key, value);
    	
    	if (this.cache.containsKey(key)) {
    		this.cache.remove(key);
    		this.frequency.remove(this.frequency.indexOf(key));
    	}
    
    	this.cache.put(key, value);
    	this.frequency.add(0, key);
    }
}