import java.io.*;
import java.util.*;

class BoundaryOfMatrix
{
    public static void main(String args[])throws IOException
    {
            int a[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}};

            int n =4;
            int m =4;
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
}
class Solution
{
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<>();
        
        if(n==1)
            for(int i=0;i<m;i++) ans.add(matrix[0][i]);
        else if(m==1)
            for(int i=0;i<n;i++) ans.add(matrix[i][0]);
        else{
            for(int i=0;i<m-1;i++) ans.add(matrix[0][i]);
            for(int i=0;i<n-1;i++) ans.add(matrix[i][m-1]);
            for(int i=m-1;i>0;i--) ans.add(matrix[n-1][i]);
            for(int i=n-1;i>0;i--) ans.add(matrix[i][0]);
        }
        
        return ans;
    }
}
