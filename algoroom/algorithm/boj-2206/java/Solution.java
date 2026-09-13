import java.util.*;

class Solution {

    static int[][] grid;
    static boolean[][][] visited;

    static int n;
    static int m;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public int solution(int[][] maps) {
        int answer = -1;
        grid = maps;
        n = grid.length;
        m = grid[0].length;
        if (n == 1 && m == 1) {
            return 1;
        }
        visited = new boolean[n][m][2];
        answer = bfs();
        return answer;
    }

    public int bfs() {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerLast(new int[]{0, 0, 0, 1});
        visited[0][0][0] = true;

        while(!deque.isEmpty()) {
            int[] cur = deque.pollFirst();
            int cx = cur[0];
            int cy = cur[1];
            int bk = cur[2];
            int dis = cur[3];
            if (cx == n - 1 && cy == m - 1) {
                return dis;
            }
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (!isRange(nx, ny)) {
                    continue;
                }
                if (grid[nx][ny] == 0 && !visited[nx][ny][bk]) {
                    deque.offerLast(new int[]{nx, ny, bk, dis + 1});
                    visited[nx][ny][bk] = true;
                }
                else if (grid[nx][ny] == 1 && bk == 0 && !visited[nx][ny][1]) {
                    deque.offerLast(new int[]{nx, ny, 1, dis + 1});
                    visited[nx][ny][1] = true;
                }
            }
        }

        return -1;
    }

    public boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}