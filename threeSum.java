import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class threeSum {
   public static List<List<Integer>> findList(int num[]){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                for(int k=j+1;k<num.length;k++){
                    if(num[i]+num[j]+num[k] ==0){
                        List<Integer> curr=new ArrayList<Integer>();
                        curr.add(num[i]);
                        curr.add(num[j]);
                        curr.add(num[k]);
                        Collections.sort(curr);
                        result.add(curr);
                    }
                }
            }
        }
        
       result=new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(result));
        return result;
    }
    public static void main(String[] args) {
        int arr[]={-1,-4,-1,0,2,1};
        System.out.println(findList(arr)); 
    }
}
