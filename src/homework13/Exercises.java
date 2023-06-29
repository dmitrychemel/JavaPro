package homework13;

import java.util.*;

/**
 * Java Pro. Homework #13
 * @author Dzmitry Chemel
 * @version 27 June 2023
 */

public class Exercises {
    public static void main(String[] args) {

        // Понимаю что есть более оптимальный способ решения, хотел бы увидеть код
        Map<String, String> trips = new HashMap<>();

        trips.put("Berlin", "London");
        trips.put("Tokyo", "Seoul");
        trips.put("Mumbai", "Berlin");
        trips.put("Seoul", "Mumbai");

        showWay(trips);

    }

    private static Map<String, String> startPosition(Map<String, String> trips) {
        Map<String, String> way = new LinkedHashMap<>();
        Set<String> setKeys = trips.keySet();

        for(String key : setKeys){
            if(!trips.containsValue(key)){
                way.put(key,trips.get(key));
            }
        }

        return way;
    }

    private static Map<String, String> findWay(Map<String, String> trips) {
        Map<String, String> way = startPosition(trips);
        Set<String> setKeys = trips.keySet();

        while(way.size() != trips.size()) {
            for (String key : setKeys) {
                if (way.containsValue(key)) {
                    way.put(key, trips.get(key));
                }
            }
        }

        return way;
    }

    private static void showWay(Map<String, String> trips) {
        Map<String, String> way = findWay(trips);
        Set<String> keys = way.keySet();

        for (String key : keys) {
            String value = way.get(key);
            System.out.println(key + " -> " + value);
        }

    }
}
