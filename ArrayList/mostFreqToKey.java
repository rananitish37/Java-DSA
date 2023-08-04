package ArrayList;

import java.util.ArrayList;

public class mostFreqToKey {
    public static int[] mostFrequent(int[] nums,int key){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                list.add(nums[i+1],nums[i+1]+1);
            }
        }
        int maxCount=0,maxValue=0;
        for()
    }
    public static void main(String[] args) {
        int []nums={1,100,200,1,100};
        int key=1;
    }
}
