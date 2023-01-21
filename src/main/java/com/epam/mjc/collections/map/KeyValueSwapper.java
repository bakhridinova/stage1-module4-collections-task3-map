package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry: sourceMap.entrySet()) {
            if (stringIntegerMap.containsKey(entry.getValue())) {
                if (entry.getKey() < stringIntegerMap.get(entry.getValue())) {
                    stringIntegerMap.put(entry.getValue(), entry.getKey());
                    continue;
                }
             }
            stringIntegerMap.put(entry.getValue(), entry.getKey());
        }
        return stringIntegerMap;
    }
}
