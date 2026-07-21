import java.util.*;

public class Main {
    /*
    숫자 1은 벽이 있어 해당 칸이 이동할 수 없는 곳
    숫자 2는 해당 칸에 사람이 서있음
    숫자 3은 해당 공간이 비를 피할 수 있는 공간
    */

    static int n;
    static int h;
    static int m;

    static int[][] grid;
    static int[][] step;
    static boolean[][] visited;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        h = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][n];
        step = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                step[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    step[i][j] = bfs(i, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(step[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int bfs(int startX, int startY) {
        Deque<int[]> deque = new ArrayDeque<>();
        visited = new boolean[n][n];
        
        visited[startX][startY] = true;
        deque.offerLast(new int[]{startX, startY, 0});

        while(!deque.isEmpty()) {

            int[] current = deque.pollFirst();
            int cx = current[0];
            int cy = current[1];
            int cs = current[2];
            
            // 방문했고, 3(비를 피할 수 있는 공간에 위치)                                  
            if (grid[cx][cy] == 3) {
                return cs;
            }

            for (int i = 0; i < 4; i++) {

                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (!isRange(nx, ny)) {
                    continue;
                }

                if (visited[nx][ny] || grid[nx][ny] == 1) {
                    continue;
                }

                visited[nx][ny] = true;
                deque.offerLast(new int[]{nx, ny, cs + 1});
            }
        }

        return -1;
    }

    static boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
}