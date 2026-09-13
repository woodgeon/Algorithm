import java.util.*;

class Solution {

    static int[][] grid;
    static boolean[][] visited;
    static int n;
    static int m;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public int solution(int[][] maps) {
        grid = maps;
        n = grid.length;
        m = grid[0].length;
        
        visited = new boolean[n][m];

        bfs(0, 0);
        
        int answer = -1;
        if (visited[n - 1][m - 1]) {
            answer = grid[n - 1][m - 1];
        }
        return answer;
    }

    public void bfs(int x, int y) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerLast(new int[]{x, y});
        visited[x][y] = true;

        while(!deque.isEmpty()) {
            int[] current = deque.pollFirst();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                // 범위를 벗어나지 않고, grid가 1이며, 방문하지 않았다면
                if (isRange(nx, ny) && grid[nx][ny] == 1 && !visited[nx][ny]) {
                    deque.offerLast(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    grid[nx][ny] = grid[cx][cy] + 1;
                }
            }
        }
    }

    public boolean isRange(int nx, int ny) {
        // true를 반영한다는 건, 이 조건에 다 부합하다는 뜻.
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}
