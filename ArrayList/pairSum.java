package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class pairSum {
    static int Maxsum=0;
    public static void findSum(ArrayList<Integer> list,int target){
        int i=0,j=list.size()-1;
        while(i<j){
            if(list.get(j) == target-list.get(i)){
                System.out.println(i +","+j);
            }
            if(list.get(j)<target-list.get(i)){
                i++;
            }else{
                j--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        findSum(list,5);
        
    }
}
