import java.util.*;

public class Main {
    /*
    큰 틀은.. 시작지점을 기점으로 BFS 돌리는데..
    시작점 값보다 작은 애들만 방문하고 만약 없다면 제자리..
    그리고 BFS 돌면서 큰 값 찾고, 큰 값이 행에 여러개라면 열 번호가 가장 작은 것으로..
    그리하여..
    1. 작은 값일 때만 방문할 수 있는 조건으로 BFS
    2. 돌면서 max값 탐색
    3. 2중 for문으로 가장 먼저 걸린 큰 값 방문. 이렇게하면 행과 열 최소 만족.
    3-1. 2중 for문 시, 방문한 곳이 true 인 곳만 조건검사하고 아니면 continue;
    4. 이동 후 방문배열 전체 초기화. 그리고 이동 후 좌표 저장 후 다음 위치에 해당 좌표로부터 시작
    1 ~ 4 반복..
    */
    static int[][] grid;
    static boolean[][] visited;
    static int max;

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
        int startX = sc.nextInt() - 1;
        int startY = sc.nextInt() - 1;

        for (int i = 0; i < k; i++) {
            max = 0;
            bfs(startX, startY, n);
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    // 방문한 값에 대해서만 검사
                    if (visited[j][l]) {
                        // 방문한 애들 순차적으로 검사하는데, 큰값이 걸린다 -> 위치 저장
                        if (grid[j][l] == max) {
                            startX = j;
                            startY = l;

                            visited = new boolean[n][n];
                        }
                    }
                }
            }
        }

        System.out.print((startX + 1) + " " + (startY + 1));
    }

    static void bfs(int startX, int startY, int n) {
        Deque<int[]> deque = new ArrayDeque<>();

        visited[startX][startY] = true;
        deque.offerLast(new int[]{startX, startY});
        int startValue = grid[startX][startY];

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

                int nextValue = grid[nx][ny];
                if (visited[nx][ny] || startValue <= nextValue) {
                    continue;
                }

                visited[nx][ny] = true;
                max = Math.max(max, grid[nx][ny]);
                deque.offerLast(new int[]{nx, ny});
            }
        }

    }

    static boolean isRange(int nx, int ny, int n) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
}