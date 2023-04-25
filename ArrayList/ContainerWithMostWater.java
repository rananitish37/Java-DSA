package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {
    static int water=0;
    public static void calculate(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int width=j-i;
                int height;
                if(list.get(i)<list.get(j)){
                    height=list.get(i);
                }else{
                    height=list.get(j);
                }
                int currWater=height*width;
                if (water < currWater) {
                    water=currWater;
                }
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
        // calculate(list);
        // System.out.println(water);
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
