import java.util.HashSet;

import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        // System.out.println(hs);


        // using iterator class
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }


        // using convetional loop for iterating througth the hashset
        // for(int i : hs){
        //     System.out.println(i);
        // }


    }
}
