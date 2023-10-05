import java.io.*;
import java.util.*;
class NoOfSubstring
{
    public static void main (String[] args)
    {
        String s = "abc";
        int k = 2;
		System.out.println (new Solution().substrCount (s, k));
        
    }
}
class Solution
{
    long substrCount (String S, int K) {
        // your code here

        return atmost(S,K)-atmost(S,K-1);
    }
    long atmost(String s, int k){
        int arr[] = new int[26];

        int dist = 0, left = 0;
        long res = 0;

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            if(arr[s.charAt(i)-'a']==1) dist++;

            while(dist>k){
                arr[s.charAt(left)-'a']--;
                if(arr[s.charAt(left)-'a']==0) dist--;
                left++;
            }

            res = res + (i-left+1);   
        }
        return res;
    }
}
