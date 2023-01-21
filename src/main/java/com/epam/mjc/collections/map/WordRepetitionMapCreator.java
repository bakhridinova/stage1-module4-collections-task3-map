package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.toLowerCase().split("[!\"#$%&'()*+,\\-./:;<=>?@\\[\\]^_`{|}~ ’“”—‘]");
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
}
