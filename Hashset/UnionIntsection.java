package Hashset;

import java.util.HashSet;

public class UnionIntsection {
    public static void main(String[] args) {
        int arr1[] = {5,3,8};
        int arr2[] = {2,3,7,9,5,1};

        HashSet<Integer> set = new HashSet<>();


        // UNION
        // copy first array
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        // copy second arr and will put only unique
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println(set.size());


        // INTESECTION

        set.clear();

        for(int i =0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        int count=0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }
}
