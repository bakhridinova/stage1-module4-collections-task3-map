package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry: sourceMap.entrySet()) {
            stringIntegerMap.put(entry.getValue(), Math.min(entry.getKey(), stringIntegerMap.getOrDefault(entry.getValue(), Integer.MAX_VALUE)));
        }
        return stringIntegerMap;
    }
}
