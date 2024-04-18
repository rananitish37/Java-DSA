package Hashset;

import java.util.HashSet;

public class CountDistinctElm {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,2,1,4,5,8,6,7,3};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
