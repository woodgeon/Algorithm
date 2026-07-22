import java.util.*;

public class Main {

    static int[][] grid;
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
        visited = new boolean[n][m];

        snail(0, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void snail(int startX, int startY) {
        int cx = startX;
        int cy = startY;
        
        grid[cx][cy] = 1;
        visited[cx][cy] = true;
        int dir = 0;

        for (int i = 2; i <= n * m; i++) {
            int nx = cx + dx[dir];
            int ny = cy + dy[dir];

            if (!isRange(nx, ny) || visited[nx][ny]) {
                dir++;
                dir = getDir(dir);
                nx = cx + dx[dir];
                ny = cy + dy[dir];
            }
            grid[nx][ny] = i;
            visited[nx][ny] = true;

            cx = nx;
            cy = ny;
        }
    }

    static boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }

    static int getDir(int dir) {
        int temp = dir % 4;
        return temp;
    }
}