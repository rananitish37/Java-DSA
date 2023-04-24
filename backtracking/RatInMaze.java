package backtracking;

import java.util.ArrayList;

public class RatInMaze {
    public static ArrayList<String> ratMaze(int [][]maze,int n){
        int vis[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
        int di[]={1,0,0,-1};
        int dj[]={0,-1,1,0};
        ArrayList<String> ans=new ArrayList<>();
        if(maze[0][0]==1){
            solve(0,0,maze,n,ans,"",vis,di,dj);
        }
        return ans;
    }
    public static void solve(int i,int j,int maze[][],int n,ArrayList<String> ans,String move,int [][]vis,int di[],int dj[]){
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        String dir="DLRU";
        for(int idx=0;idx<4;idx++){
            int nexti=i+di[idx];
            int nextj=j+dj[idx];
            if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && vis[nexti][nextj]==0 && maze[nexti][nextj]==1){
                vis[i][j]=1;
                solve(nexti, nextj, maze, n, ans, move+dir.charAt(idx),vis, di, dj);
                vis[i][j]=0;
            }
        }
    }
    public static void main(String[] args) {
        int [][] maze={{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}};
         int N=4;
         System.out.println(ratMaze(maze,N));
    }
}
