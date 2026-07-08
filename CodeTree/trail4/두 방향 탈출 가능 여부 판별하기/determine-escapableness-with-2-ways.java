import java.util.*;

public class Main {
    
    static int[][] grid;
    static boolean[][] visited;

    static int[] dx = {1, 0};
    static int[] dy = {0, 1};
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        grid = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        visited[0][0] = true;
        dfs(0, 0, n, m);
        int result = 0;

        if (visited[n - 1][m - 1]) {
            result = 1;
        }
        System.out.print(result);
    }
    
    static void dfs(int x, int y, int n, int m) {

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i]; // 새롭게 이동하는 행
            int ny = y + dy[i]; // 세롭게 이동하는 열
            if (!isRange(nx, ny, n, m)) {
                continue;
            }
            if (visited[nx][ny] || grid[nx][ny] == 0) {
                continue;
            }
            visited[nx][ny] = true;
            dfs(nx, ny, n, m);
        }
    }

    static boolean isRange(int nx, int ny, int n, int m) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}