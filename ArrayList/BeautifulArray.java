package ArrayList;

import java.util.ArrayList;

public class BeautifulArray {
    public static int[] beautifulArray(int n) {
        int []nums=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);//for default
        while(list.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();
            for(Integer ele:list){
                if(ele*2-1<=n){
                    temp.add(ele*2-1);
                }
            }
            for(Integer ele:list){
                if(ele*2<=n){
                    temp.add(ele*2);
                }
            }
            list=temp;
        }
        for(int i=0;i<n;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
    public static void main(String[] args) {
        int n=4;
        int []res=beautifulArray(n);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
