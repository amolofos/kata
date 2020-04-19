package com.dkafetzi.kata;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LRUCacheO1 extends LRUCache {

	private final static Logger LOGGER = LoggerFactory.getLogger(LRUCacheBruteForce.class);
	
	protected LinkedHashMap<Integer, Integer> cache;
	
	public LRUCacheO1(int capacity) {
		super(capacity);

		this.cache = new LinkedHashMap<Integer, Integer>() {
			/**
			 *
			 */
			private static final long serialVersionUID = 1L;
			protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
				return size() > capacity; 
			}
		};
	}

	public int get(int key) {
		LOGGER.debug("Get: key: {}.", key);

		int result = this.cache.getOrDefault(key, -1);
		if (result != -1) {
			this.cache.remove(key);
			this.cache.put(key, result);
		}

		LOGGER.debug("Get: key: {}, result: {}.", key, result);
		return result;
	}

	public void put(int key, int value) {
		LOGGER.debug("Put: key: {}, value: {}.", key, value);

		this.cache.remove(key);
		this.cache.put(key, value);
	}
}
