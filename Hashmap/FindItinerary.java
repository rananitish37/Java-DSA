package Hashmap;

import java.util.HashMap;

public class FindItinerary {
    public static String findStart(HashMap<String, String> map1){
        HashMap<String, String> map2 = new HashMap<>();
        for(String key : map1.keySet()){
            map2.put(map1.get(key), key);
        }

        for(String key : map1.keySet()){
            if(!map2.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void printItinerary(HashMap<String, String> map1){
        

        String start = findStart(map1);
        System.out.print(start);
        for(String key : map1.keySet()){
            System.out.print(" -> " +map1.get(start));
            start = map1.get(start);
        }
    }
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>(); 
        map1.put("Chennai", "Banglore"); 
        map1.put("Bombay", "Delhi"); 
        map1.put("Goa", "Chennai"); 
        map1.put("Delhi", "Goa"); 

        printItinerary(map1);
    }
}
