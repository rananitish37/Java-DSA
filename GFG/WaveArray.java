
//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    import java.util.Arrays;
    class WaveArray {
        public static void main(String[] args) throws IOException {
                int[] a = {1,2,3,4,5};
                Solution obj = new Solution();
                obj.convertToWave(a.length, a);
                StringBuffer sb=new StringBuffer("");
                for(int i : a){
                    sb.append(i+" ");
                }
                System.out.println(sb.toString());
        }
    }
    class Solution {
        public static void convertToWave(int n, int[] a) {
            // code here
            int i=0,j=1;
            while(i<j && i<n &&j<n){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i+=2;
                j+=2;
            }
        }
    }
            
    
