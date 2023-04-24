
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
public class threeSum3 {
    public static List<List<Integer>> findList(int num[]){
        Arrays.sort(num);
        List<List<Integer>> result=new LinkedList<List<Integer>>();
        for(int i=0;i<num.length;i++){
            if(i==0 || (i>0 && num[i]!=num[i-1])){
                int start=i+1,end=num.length-1,sum=0-num[i];
                while(start<end){
                    if(num[start]+num[end]==sum){
                        result.add(Arrays.asList(num[i],num[start],num[end]));
                        while(start<end && num[start]==num[start+1])start++;
                        while(start<end && num[end]==num[end-1])end--;
                        start++;end--;
                    }else if(num[start]+num[end]<sum){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []a={-1,-2,-2,-1,-1,2,0,2,0,5,2};
        System.out.println(findList(a)); 
    }
}
