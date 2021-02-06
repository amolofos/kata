package com.dkafetzi.kata;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/problems/most-common-word/
 * 
 * See README.md for more information
 *   
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public String mostCommonWordOnePass(String paragraph, String[] banned) {

        Set<String> bannedWords = new HashSet<String>();
        for (String word : banned)
            bannedWords.add(word);

        String mostCommonWord = "";
        int maxCount = 0;

        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        StringBuilder wordBuffer = new StringBuilder();

        char[] chars = paragraph.toCharArray();
        for (int p = 0; p < chars.length; p++) {
            char currChar = chars[p];

            // 1). consume the characters in a word
            if (Character.isLetter(currChar)) {
                wordBuffer.append(Character.toLowerCase(currChar));
                if (p != chars.length - 1)
                    // skip the rest of the processing
                    continue;
            }

            // 2). at the end of one word or at the end of paragraph
            if (wordBuffer.length() > 0) {
                String word = wordBuffer.toString();
                // identify the maximum count while updating the wordCount table.
                if (!bannedWords.contains(word)) {
                    int newCount = wordCount.getOrDefault(word, 0) + 1;
                    wordCount.put(word, newCount);
                    if (newCount > maxCount) {
                    	mostCommonWord = word;
                        maxCount = newCount;
                    }
                }
                // reset the buffer for the next word
                wordBuffer = new StringBuilder();
            }
        }
        return mostCommonWord;
    }
    
    public String mostCommonWordPipeline(String paragraph, String[] banned) {
        // 1). replace the punctuations with spaces,
        // and put all letters in lower case
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();

        // 2). split the string into words
        String[] words = normalizedStr.split("\\s+");

        Set<String> bannedWords = new HashSet<String>();
        for (String word : banned)
            bannedWords.add(word);

        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        // 3). count the appearance of each word, excluding the banned words
        for (String word : words) {
            if (!bannedWords.contains(word))
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // 4). return the word with the highest frequency
        return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}