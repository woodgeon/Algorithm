import java.util.*;

public class Main {

    static boolean[][] visited;
    static int[][] grid;
    static int n;
    static int count = 0;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }


        int result = 0;
        int maxBlock = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    int num = grid[i][j];
                    dfs(i, j, num);
                    if (count >= 4) {
                        result++;
                    }
                    maxBlock = Math.max(maxBlock, count);
                    count = 0;
                }
            }
            
        }

        System.out.print(result + " " + maxBlock);

    }

    static void dfs(int cx, int cy, int num) {
        visited[cx][cy] = true;
        count++;
        for (int i = 0; i < 4; i++) {

            int nx = cx + dx[i];
            int ny = cy + dy[i];

            if (!isRange(nx, ny)) {
                continue;
            }

            if (visited[nx][ny] || grid[nx][ny] != num) {
                continue;
            }

            dfs(nx, ny, num);
        } 
    }

    static boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
}