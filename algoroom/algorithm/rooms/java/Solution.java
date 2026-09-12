import java.util.*;

class Solution {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int n;
    static int m;

    static String[] grid;
    static boolean[][] visited;
    
    public int solution(String[] floor) {
        int answer = 0;
        
        n = floor.length;
        m = floor[0].length();
        grid = floor;
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i].charAt(j) == '.' && !visited[i][j]) {
                    answer++;
                    dfs(i, j);
                }
            }
        }
        
        return answer;
    }

    public void dfs(int x, int y) {
        Deque<int[]> stack = new ArrayDeque<>();
        stack.offerLast(new int[]{x, y});
        visited[x][y] = true;

        while (!stack.isEmpty()) {
            int[] current = stack.pollLast();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                /*
                1. 범위를 벗어나지 않고
                2. 벽이 아니며
                3. 방문하지 않았다면
                */
                if (isRange(nx, ny) && grid[nx].charAt(ny) != '#' && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    stack.offerLast(new int[]{nx, ny});
                }
            }
        }
    }

    public boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}
