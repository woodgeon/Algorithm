class Solution {

    static int[][] grid;
    static int[][] dp;

    static int n;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public int solution(int[][] forest) {
        grid = forest;
        n = grid.length;

        dp = new int[n][n];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer = Math.max(answer, dfs(i, j));
            }
        }
        
        return answer;
    }

    public int dfs(int x, int y) {

        if (dp[x][y] != 0) {
            return dp[x][y];
        }
        dp[x][y] = 1;

        for (int i = 0; i < 4; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (!isRange(nx, ny)) {
                continue;
            }
            
            if (grid[nx][ny] > grid[x][y]) {
                dp[x][y] = Math.max(dp[x][y], dfs(nx, ny) + 1);
            }
        }
        return dp[x][y];
    }

    public boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
}
