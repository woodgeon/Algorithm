import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                arr[i][j] = 0;
            }
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            arr[r][c] = 1;
            System.out.println(isComportable(arr, r, c, n));
        }
    }

    static int isComportable(int[][] arr, int r, int c, int n) {
        int count = 0;

        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int dirNum = 0;
        for (int i = 0; i < 4; i++) {
            dirNum = (dirNum + 1) % 4;
            int nr = r + dx[dirNum]; // 1 + dx[3](1) = 2;
            int nc = c + dy[dirNum]; // 2 + dy[3](0) = 2;
            if (!isRange(nr, nc, n)) {
                continue;
            }
            if (arr[nr][nc] == 1) count++;
        }
        if (count == 3) return 1;
        else return 0;
    }

    static boolean isRange(int r, int c, int n) {
        return (0 < r && r < n + 1 && 0 < c && c < n + 1);
    }
}