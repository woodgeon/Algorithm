import java.util.*;

class Solution {

    static int[][] grid;
    static boolean[][] visited;
    static Deque<int[]> deque = new ArrayDeque<>();
    static int n;
    static int m;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public int solution(int[][] box) {
        grid = box;
        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];

        boolean flag = true;
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    flag = false;
                    break outer;
                }
            }
        }
        if (flag) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    deque.offerLast(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        int answer = bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j] == 0) {
                    return -1;
                }
            }
        }
        
        return answer;
    }

    public int bfs() {
        int count = -1;
        while(!deque.isEmpty()) {
            // 큐의 사이즈. 즉 매 시행횟수마다 익은 토마토는 한번에 처리되어야 하기 때문에 한 사이클로 묶어야함.
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                // 익은 토마토의 현재 위치.
                int[] cur = deque.pollFirst();
                int cx = cur[0];
                int cy = cur[1];

                for (int j = 0; j < 4; j++) {
                    int nx = cx + dx[j];
                    int ny = cy + dy[j];
                    
                    // 범위를 안에 있고
                    // 토마토가 안 익었고 
                    // 방문한 적 없다면
                    if (isRange(nx, ny) && grid[nx][ny] == 0 && !visited[nx][ny]) {
                        // 0이었던 안 익은 토마토만 큐에 넣고, 방문처리.
                        deque.offerLast(new int[]{nx, ny});
                        grid[nx][ny] = 1;
                        visited[nx][ny] = true;
                    }
                }
            }
            
            count++;
        }
        
        return count;
    }

    public boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}
