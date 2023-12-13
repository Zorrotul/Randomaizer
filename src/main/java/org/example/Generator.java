package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Generator {
    public static HashMap<String, String> generateMap(Set<String> list) {
        HashMap map = new HashMap<String, String>();
        int value;
        List<String> temporaryList = new ArrayList<>();
        temporaryList.addAll(list);
        for (String i : list) {
            String currentElement = i;
            temporaryList.remove(i);
            if (temporaryList.isEmpty()) {
                value = RandomIntGenerator.generateRandomInt(temporaryList.size())-1;
                map.put(i, map.get(value));
                map.put(value, i);
            } else {
                value = RandomIntGenerator.generateRandomInt(temporaryList.size());
                map.put(i, temporaryList.get(value));
                //System.out.println(i + " дарит " + temporaryList.get(value));
                temporaryList.remove(value);
                if (!map.containsValue(currentElement)) {
                    temporaryList.add(currentElement);
                }
            }
        }
        return map;
    }


}
