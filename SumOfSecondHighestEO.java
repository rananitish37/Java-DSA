import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SumOfSecondHighestEO {
    public static int findSum(int n,int[]arr){
        ArrayList<Integer> evenPos=new ArrayList<>();
        ArrayList<Integer> oddPos=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evenPos.add(arr[i]);
            }else{
                oddPos.add(arr[i]);
            }
        }
        Collections.sort(evenPos,Collections.reverseOrder());
        Collections.sort(oddPos,Collections.reverseOrder());
        return evenPos.get(1)+oddPos.get(1);
    }
    public static void main(String[] args) {
        int n=7;
        int arr[]={1,3,6,7,2,4};
        
        System.out.println(findSum(n,arr));
    }
}
