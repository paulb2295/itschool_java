package session14.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Integer> myMap = initializeMap();
        int retrieveValue = retrieveValue(myMap, "one");
        System.out.println(retrieveValue);

        updateMap(myMap, "three", 10);
        System.out.println(retrieveValue(myMap, "three"));

        removeEntry(myMap, "three");
        System.out.println(myMap);

    }

    private static Map<String, Integer> initializeMap() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        return myMap;
    }

    private static Integer retrieveValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    private static void updateMap(Map<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    private static void removeEntry(Map<String, Integer> map, String key) {
        map.remove(key);
    }
}
