package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        Set<String> keys = new HashSet<>(sourceMap.keySet());
        for (String key : keys) {
            if (!map.containsKey(key.length())) {
                map.put(key.length(), new HashSet<>());
                map.get(key.length()).add(key);
            } else {
                map.get(key.length()).add(key);
            }
        }
        return map;
    }
}
