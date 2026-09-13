import java.util.*;

class Solution {

    static int[][] grid;
    static int[][] dp;

    static int n;
    static int m;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public int solution(int[][] heights) {
        int answer = 0;
        grid = heights;
        n = grid.length;
        m = grid[0].length;
        dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        answer = dfs(0, 0);
        
        return answer;
    }
    public int dfs(int x, int y) {
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        if (x == n - 1 && y == m - 1) {
            return 1;
        }

        dp[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (!isRange(nx, ny)) {
                continue;
            }

            if (grid[nx][ny] < grid[x][y]) {
                dp[x][y] += dfs(nx, ny);
            }
        }
        return dp[x][y];
    }

    public boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}
