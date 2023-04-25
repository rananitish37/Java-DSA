package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class monotonic {
    public static boolean checkMonotonic(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }
        return dec||inc;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(checkMonotonic(list));
    }
}
