import java.util.*;
import java.lang.*;
import java.io.*;


class NoOfEnclaves {
    public static void main(String[] args) throws IOException {
            int a[][] = {{0, 0, 0, 0},
            {1, 0, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}};
            Solution ob = new Solution();
            System.out.println(ob.numberOfEnclaves(a));
        }
    }
class Solution {
    private int[] dx = {-1, 0, 1, 0};
    private int[] dy = {0, 1, 0, -1};

    public int numberOfEnclaves(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1) {
                dfs(i, 0, vis, n, m, grid);
            }
            if (grid[i][m - 1] == 1) {
                dfs(i, m - 1, vis, n, m, grid);
            }
        }

        for (int j = 0; j < m; j++) {
            if (grid[0][j] == 1) {
                dfs(0, j, vis, n, m, grid);
            }
            if (grid[n - 1][j] == 1) {
                dfs(n - 1, j, vis, n, m, grid);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private boolean isSafe(int x, int y, boolean[][] vis, int n, int m, int[][] grid) {
        return x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == 1 && !vis[x][y];
    }

    private void dfs(int i, int j, boolean[][] vis, int n, int m, int[][] grid) {
        vis[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (isSafe(x, y, vis, n, m, grid)) {
                dfs(x, y, vis, n, m, grid);
            }
        }
    }
}