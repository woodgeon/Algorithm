import java.util.*;

public class Main {

    static int[][] step;

    static int n;

    static int[] dx = {0, -2, 0, 2};
    static int[] dy = {2, 0, -2, 0};

    static int[] udrl = {1, -1};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        step = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                step[i][j] = -1;
            }
        }

        int startX = sc.nextInt() - 1;
        int startY = sc.nextInt() - 1;

        int endX = sc.nextInt() - 1;
        int endY = sc.nextInt() - 1;

        bfs(startX, startY, 0);

        System.out.print(step[endX][endY]);
    }

    static void bfs(int startX, int startY, int s) {
        Deque<int[]> deque = new ArrayDeque<>();

        step[startX][startY] = s;
        deque.offerLast(new int[]{startX, startY});

        while(!deque.isEmpty()) {

            int[] current = deque.pollFirst();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (i % 2 == 0) {
                    for (int j = 0; j < 2; j++) {
                        int rx = nx + udrl[j];

                        if (!isRange(rx, ny) || step[rx][ny] != -1) {
                            continue;
                        }

                        deque.offerLast(new int[]{rx, ny});
                        step[rx][ny] = step[cx][cy] + 1;
                    }
                }
                else {
                    for (int j = 0; j < 2; j++) {
                        int ry = ny + udrl[j];

                        if (!isRange(nx, ry) || step[nx][ry] != -1) {
                            continue;
                        }

                        deque.offerLast(new int[]{nx, ry});
                        step[nx][ry] = step[cx][cy] + 1;
                    }
                }
            }
        }
    }

    static boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
}