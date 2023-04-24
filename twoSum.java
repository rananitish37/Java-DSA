import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
public class twoSum {
    public static List<List<Integer>> findList(int num[]){
        Arrays.sort(num);
        List<List<Integer>> result=new LinkedList<List<Integer>>();
        
        for(int i=0;i<num.length;i++){
            int start=0,end=num.length-1;
            while(start<end){
                List<Integer> curr=new ArrayList<>();
                if(num[start]+num[end]==0){
                    curr.add(num[start]);
                    curr.add(num[end]);
                    Collections.sort(curr);
                    result.add(curr);
                    start++;end--;
                }else if(num[start]+num[end]<0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        result=new ArrayList<List<Integer>>(new HashSet<List<Integer>>(result));
        return result;
    }
    public static void main(String[] args) {
        int a[]={-1,-4,-1,0,2,1};
        System.out.println(findList(a)); 
    }
}
