import java.util.*;

class Solution {

    static int[][] grid;
    static boolean[][] visited;
    static int n;
    static int m;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public int solution(int[][] maps) {
        int answer = -1;
        
        grid = maps;
        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];

        bfs(0, 0);
        if (visited[n - 1][m - 1]) {
            answer = grid[n - 1][m - 1];
        }
        
        return answer;
    }

    public void bfs(int x, int y) {
        Deque<int[]> deque = new ArrayDeque<>();
        visited[x][y] = true;
        deque.offerLast(new int[]{x, y});

        while(!deque.isEmpty()) {
            int[] current = deque.pollFirst();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (isRange(nx, ny) && grid[nx][ny] == 1 && !visited[nx][ny]) {
                    deque.offerLast(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    grid[nx][ny] = grid[cx][cy] + 1;
                }
            }
        }
    }

    public boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }


    
    
}
