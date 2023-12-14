package org.example;

import java.util.*;

public class Generator {
    public static HashMap<String, String> generateShuffledList(Set<String> list) {
        HashMap map = new HashMap<String, String>();
        int value;
        List<String> temporaryList = new ArrayList<>();
        temporaryList.addAll(list);
        for (String i : list) {
            String currentElement = i;
            temporaryList.remove(i);
            if (temporaryList.isEmpty()) {
                value = RandomIntGenerator.generateRandomInt(temporaryList.size()) - 1;
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

    public static String[] generateShuffledListVer2(List<String> list) {

        String[] finalList = new String[list.size()];

        List<String> temporaryList = new ArrayList<>();
        temporaryList.addAll(list);
        int randomizedIndex;
        String value;
        //String firstElement = list.get(0);
        int currentIndex = 0;

        for (int i = 0; i < list.size()-1; i++) {
            value = list.get(currentIndex);
            temporaryList.remove(value);
            randomizedIndex = RandomIntGenerator.generateRandomInt(temporaryList.size());
            currentIndex = list.indexOf(temporaryList.get(randomizedIndex));
            System.out.println(value + " получает подарок под номером " + (int)(currentIndex+1));
            finalList[currentIndex]= value;
        }
        finalList[0] =list.get(currentIndex);
        System.out.println(list.get(currentIndex) + " получает подарок под номером " + (int)(0+1));

        return finalList;
    }
}
