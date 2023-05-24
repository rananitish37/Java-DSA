import java.util.*;
public class kLargestUsingPQ {
    static int[] kLargest(int[] arr, int n, int k) {
        // code here
        PQueue<Integer> pq=new PQueue<>();
        for(int i=0;i<n;i++){
            if(i<k){
                pq.add(arr[i]);
            }else{
                if(pq.peek() < arr[i]){
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> lst=new ArrayList<>(pq);
        Collections.sort(lst,Collections.reverseOrder());
        System.out.println(lst.size());
        int [] res = new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i]=lst.get(i);
        }
        System.out.println(lst);
        return res;
    }
    public static void main(String[] args) {
        int arr[]={12,5,787,1,23};
        int res[]=kLargest(arr, 5, 2);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
