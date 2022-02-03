package com.example.livebook.app.services;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class RecursiveHashMapTraversal {
    int count = 0;
    int i = 0;

    @SuppressWarnings("unchecked")
    private  int findReplaceValueByKey(String[] directionOfMovementAlongTheTreePath, String key, int newValue, HashMap<String, Object> map) {
//        for (Object o : map.values()) {
        map.forEach((k, v) -> {
            if (v instanceof HashMap && directionOfMovementAlongTheTreePath[i].equals(k)) {
                i++;
                count = findReplaceValueByKey(directionOfMovementAlongTheTreePath, key, newValue, (HashMap<String, Object>) v);
            }
        });

        if (map.replace(key, newValue) != null) {
            count++;
        }
        return count;
    }

}
