import java.util.*;

class Solution {
    static int[][] grid;
    static boolean[][] visited;
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    static int n;
    static int m;
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        grid = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = -1;
            }
        }
    
        bfs(maps);
        
        return grid[n - 1][m - 1];
    }
    
    static void bfs(int[][] maps) {
        Deque<int[]> deque = new ArrayDeque<>();
        int count = 1;
        visited[0][0] = true;
        grid[0][0] = count;
        deque.offerLast(new int[]{0, 0});
        
        while(!deque.isEmpty()) {
            
            int[] current = deque.pollFirst();
            int cx = current[0];
            int cy = current[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (!isRange(nx, ny)) {
                    continue;
                }
                
                if (visited[nx][ny] || maps[nx][ny] == 0) {
                    continue;
                }
                
                visited[nx][ny] = true;
                grid[nx][ny] = grid[cx][cy] + 1;
                deque.offerLast(new int[]{nx, ny});
            }
            
        }
        
    }
    
    static boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}




