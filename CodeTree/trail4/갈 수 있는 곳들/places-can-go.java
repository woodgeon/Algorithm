import java.util.*;

public class Main {

    static int[][] grid;
    static boolean[][] visited;
    static int count = 0;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            int startX = sc.nextInt();
            int startY = sc.nextInt();

            bfs(startX - 1, startY - 1, n);
        }

        System.out.print(count);
    }

    static void bfs(int startX, int startY, int n) {
        Deque<int[]> deque = new ArrayDeque<>();

        if (!visited[startX][startY]) {
            visited[startX][startY] = true;
            count++;
        }
        
        deque.offerLast(new int[]{startX, startY});

        while(!deque.isEmpty()) {

            int[] current = deque.pollFirst();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (!isRange(nx, ny, n)) {
                    continue;
                }

                if (visited[nx][ny] || grid[nx][ny] == 1) {
                    continue;
                }
                visited[nx][ny] = true;
                count++;
                deque.offerLast(new int[]{nx, ny});
            }
        }
        
    }

    static boolean isRange(int nx, int ny, int n) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
}