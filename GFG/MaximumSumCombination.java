package GFG;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class MaximumSumCombination {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // int T = sc.nextInt();
        // while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        // }
    }
}
class Solution {
    //optimized
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
         Arrays.sort(A);
        Arrays.sort(B);
        
        List<Integer> ans=new ArrayList<>();
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            
            return b[0]-a[0];
        });
        
        
        for(int i=0;i<N;i++)
        {
          pq.add(new int[]{A[i]+B[N-1],N-1});  
        }
        
        while(!pq.isEmpty() && K-->0)
        {
            int sum=pq.peek()[0];
            int ind=pq.peek()[1];
            pq.poll();
            
            ans.add(sum);
            
            if(ind-1>=0)
                pq.add(new int[]{sum- B[ind]+B[ind-1],ind-1});
        }
        
        return ans;
    }
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        List<Integer> list1=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    list1.add(A[i]+B[j]);   
                }
            }
            Collections.sort(list1,Collections.reverseOrder());
            for(int i=0;i<K;i++){
                res.add(list1.get(i));
            }
        return res;
    }
}
