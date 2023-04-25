package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

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
        
        //size()
        System.out.println("size= "+list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        list.add(5);
        System.out.println("before swap: "+list);
        //swap in Arralist
        int idx1=1,idx2=3;
        swap(list,idx1,idx2);
        System.out.println("after swap: "+list);

        //Collextion.sort()
        System.out.println("Collections.sort()======");
        System.out.println("before sort: "+list);
        Collections.sort(list);
        System.out.println("After sort: "+list);

        //Collection.sort(list,order)
        System.out.println("sort in reverse order======");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("list in reverse: "+list);
    }
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}
