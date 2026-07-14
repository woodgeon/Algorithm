import java.util.*;

public class Main {

    static int[][] grid;
    static boolean[][] visited;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        grid = new int[n][m];
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                maxHeight = Math.max(maxHeight, num);
                grid[i][j] = num;
            }
        }
        /*
        1. 1 ~ max 까지의 K를 지정
        2. dfs 수행
        2-1. 이때 K 이하의 수들은 미방문처리(갈 수 없는 곳으로)
        */
        int maxTown = 0;
        int resultK = 1;
        for (int k = 1; k <= maxHeight; k++) {
            int count = 0;
            visited = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (k < grid[i][j] && !visited[i][j]) {
                        count++;
                        dfs(i, j, k, n, m);
                    }
                }
            }
            if (maxTown < count) {
                maxTown = count;
                resultK = k;
            }
        }

        System.out.print(resultK + " " + maxTown);
    }

    static void dfs(int cx, int cy, int k, int n, int m) {
        visited[cx][cy] = true;
        for (int i = 0; i < 4; i++) {
            
            int nx = cx + dx[i];
            int ny = cy + dy[i];

            if (!isRange(nx, ny, n, m)) {
                continue;
            }
            if (grid[nx][ny] <= k || visited[nx][ny] == true) {
                continue;
            }

            dfs(nx, ny, k, n, m);
        }
    }
    static boolean isRange(int nx, int ny, int n, int m) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }

}