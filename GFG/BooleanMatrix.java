import java.io.*;
import java.util.*;

class BooleanMatrix
{
    public static void main(String args[])throws IOException
    {
            int matrix[][] = {{ 1, 0, 0},
            { 1, 0, 0},
            { 1, 0, 0},
            { 0, 0, 0}};
            Solution obj=new Solution();
            obj.booleanMatrix(matrix);
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

class Solution
{
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int n=matrix.length;
        int m=matrix[0].length;
        boolean row[]=new boolean[n];
        boolean col[]=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==true || col[j]==true){
                    matrix[i][j]=1;
                }
            }
        }
    }
}