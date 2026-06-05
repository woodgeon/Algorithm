import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] snail = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = m; j < m; j++) {
                snail[i][j] = 0;
            }
        }
        /*
        dirNum == 0
        dx[0],dy[0] = 0, 1 -> 0열의 1행 -> 우로 이동

        dirNum == 1
        dx[1],dy[1] = 1, 0 -> 1열의 0행 -> 아래로 이동

        dirNum == 2
        dx[2],dy[2] = 0, -1 -> 0열의 -1행 -> 좌로 이동

        dirNum == 3
        dx[3],dy[3] = -1, 0 -> -1열의 0행 -> 위로 이동
         */
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int cx = 0;
        int cy = 0;

        snail[cx][cy] = 1;
        int dirNum = 0;

        for (int i = 2; i <= n * m; i++) {
            // 이동할 다음 위치 미리 계산
            int nx = cx + dx[dirNum]; // nx = 0 + dx[0] : 0
            int ny = cy + dy[dirNum]; // ny = 0 + dy[0] : 1 
            
            // 다음 이동 위치가 범위에 벗어나거나 
            // snail[nx][ny] : 이동할 다음 값이 0이 아니라면 = 이미 존재한다면
            if (!isRange(nx, ny, n, m) || snail[nx][ny] != 0) {
                // 방향을 바꿈.
                dirNum = (dirNum + 1) % 4;
            }
            
            cx += dx[dirNum];
            cy += dy[dirNum];
            // 해당 i값을 달팽이 수열에 넣기
            snail[cx][cy] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(snail[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isRange(int x, int y, int n, int m) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}