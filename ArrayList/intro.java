package ArrayList;

import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //OPERATIONS
        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get single element
        int element=list.get(3);
        System.out.println(element);
        
        //set element to index ==> it will update the value on that index
        list.set(1, 6);
        System.out.println(list);

        //remove element from index
        list.remove(1);
        System.out.println(list);

        //list conatins or not
        System.out.println(list.contains(4));
        System.out.println(list.contains(9));

        //add at index => it will simply add not update as set
        list.add(1, 2);
        System.out.println(list);
        
    }
}
