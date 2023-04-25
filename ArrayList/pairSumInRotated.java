package ArrayList;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

public class pairSumInRotated {
    public static boolean findSum(ArrayList<Integer> list,int target){
        int bp=-1,lp,rp;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        lp=bp+1;
        rp=bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(11,15,6,8,9,10));
        System.out.println(findSum(list,26));
    }
}
