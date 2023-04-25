package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {
    static int water=0;
    public static void calculate(ArrayList<Integer> list){
        int i=0,j=list.size()-1;
        while(i<j){
            int width=j-i;
            int height=Math.min(list.get(i), list.get(j));
            int currwater=width*height;
            if(currwater>water){
                water=currwater;
            }
            if(list.get(i)<list.get(j)){
                i++;
            }else{
                j--;
            }
        }
    }
    public static int maxArea(int[] height) {
        int water1=0;
        int i=0,j=height.length-1;
        while(i<j){
            int wd=j-i;
            int ht=Math.min(height[i], height[j]);
            int currWater=wd*ht;
            if(currWater > water1){
                water1=currWater;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return water1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        calculate(list);
        System.out.println("using arraylist: "+water);
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println("using array: "+maxArea(height));
    }
}
