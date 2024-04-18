package Hashset;

import java.util.*;

public class LHSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("India");
        lhs.add("China");
        lhs.add("Japan");
        lhs.add("US");
        
        System.out.println(lhs);
    }
    
}
