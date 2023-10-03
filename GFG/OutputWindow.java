import java.io.*;
import java.util.*;
import java.lang.*; 
class OutputWindow
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        
        
    }
}

class Solution
{
    String colName (long n)
    {
        // your code here
        StringBuilder res=new StringBuilder();
        while(n>0){
            res.append((char)('A'+ (n-1) % 26));
            n=(n-1)/26;
        }
        return res.reverse().toString();
    }
}