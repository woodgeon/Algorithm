import java.util.*;
public class Main {

    static int[][] grid;
    static int[][] step;
    static boolean[][] visited;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        grid = new int[n][m];
        step = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        bfs(0, 0, 0);
        int result = -1;
        if (visited[n - 1][m - 1]) {
            result = step[n - 1][m - 1];
        }
        System.out.print(result);
    }

    static void bfs(int startX, int startY, int s) {
        Deque<int[]> deque = new ArrayDeque<>();

        step[startX][startY] = s;
        visited[startX][startY] = true;
        deque.offerLast(new int[]{startX, startY});

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
                if (visited[nx][ny] || grid[nx][ny] == 0) {
                    continue;
                }

                step[nx][ny] = step[cx][cy] + 1;
                visited[nx][ny] = true;
                deque.offerLast(new int[]{nx, ny});
            }
        }

    }

    static boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}