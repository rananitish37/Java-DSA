import java.util.HashMap;

public class HashMapUsingJCF {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);
    }
}
