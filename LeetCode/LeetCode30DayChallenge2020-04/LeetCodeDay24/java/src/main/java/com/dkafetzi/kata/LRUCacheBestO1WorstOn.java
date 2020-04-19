package com.dkafetzi.kata;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Time:
 *   Best  O(1) for get and put
 *   Worst O(n) for put when we hit the max size
 */
class LRUCacheBestO1WorstOn extends LRUCache {

	private final static Logger LOGGER = LoggerFactory.getLogger(LRUCacheBruteForce.class);
	
	protected HashMap<Integer, Integer> cache;
	protected HashMap<Integer, Integer> frequency;
	protected int globalCount;
	
    public LRUCacheBestO1WorstOn(int capacity) {
        super(capacity);
        
        this.cache = new HashMap<Integer, Integer>();
        this.frequency = new HashMap<Integer, Integer>();
        this.globalCount = 0;
    }
    
    public int get(int key) {
        int result = -1;

    	LOGGER.debug("Get: key: {}.", key);

        if (this.cache.containsKey(key)) {
        	result = this.cache.get(key);
        	this.frequency.replace(key, ++globalCount);
        }
        
    	LOGGER.debug("Get: key: {}, result: {}.", key, result);
        return result;
    }
    
    public void put(int key, int value) {
    	LOGGER.debug("Put: key: {}, value: {}.", key, value);
        
    	if (!this.cache.isEmpty() && !this.cache.containsKey(key)) {
    		// Evict.
    		if (this.cache.size() >= this.maxCapacity) {
    			
    			// We need to parse all the frequencies and get the
    			// smallest one.
    			int freqToRemove = globalCount;
    			int keyToRemove = -1;
    			for (Integer k : this.frequency.keySet()) {
    				int freq = this.frequency.get(k);
    		    	LOGGER.debug("Put: removing: key: {}, freq: {}.", k, freq);

    				if (freqToRemove >= freq) {
    					keyToRemove = k;
    					freqToRemove = freq;
    				}
    			}
    			
    	    	LOGGER.debug("Put: removing key: {}.", keyToRemove);
    			if (keyToRemove != -1) {
    				this.cache.remove(keyToRemove);
    				this.frequency.remove(keyToRemove);
    			}
    		}
    	}
    	
    	// Store the new item.
    	LOGGER.debug("Put: adding key: {}, value: {}.", key, value);
    	
    	if (this.cache.containsKey(key)) {
    		this.cache.replace(key, value);
        	this.frequency.replace(key, ++globalCount);
    	} else {
    		this.cache.put(key, value);
    		this.frequency.put(key, ++globalCount);
    	}
    }
}