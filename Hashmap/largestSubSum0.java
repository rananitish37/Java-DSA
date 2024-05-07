package Hashmap;

import java.util.HashMap;


public class largestSubSum0 {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        int len=0;
        int sum=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int j=0; j< arr.length; j++){
            sum += arr[j];
            if(sum == 0){
                len = j + 1;
            }
            if(hm.containsKey(sum)){
                len = Math.max(len, j-hm.get(sum));
            }else{
                hm.put(sum, j);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        // int[] arr={15,-2,2,-8,1,7,10};
        int[] arr={0,1,1,1};
        System.out.println(getLongestZeroSumSubarrayLength(arr));
        
    }
}
