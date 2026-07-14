import java.util.*;

public class Main {

    static boolean[][] visited;
    static int[][] graph;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        bfs(0, 0, n, m);

        int result = 0;
        if (visited[n - 1][m - 1]) {
            result = 1;
        }
        System.out.print(result);
    }
    
    static void bfs(int startX, int startY, int n, int m) {
        // DFS의 재귀 스택을 대신할, Queue를 생성한다.
        Deque<int[]> deque = new ArrayDeque<>();

        // 시작값을 넣고 방문처리 한다. 이 때, 큐의 맨 뒤에 넣는다.
        deque.offerLast(new int[]{startX, startY});
        visited[startX][startY] = true;

        /* 
        BFS로 갈 수 있는 모든 경우의 수를 계산하기 위한 반복문을 설정한다.
        1. 상 하 좌 우 탐색의 경우니까 각 방향이 막혔을 때 -> 큐에 데이터가 삽입되지 않을 때
        2. 그렇게 되면, 큐는 비게 되니까 while문의 조건은 q가 비어있지 않을 때까지 진행한다.
        2-1. 큐가 비어있지 않다면 isEmpty()는 false. !연산자에 의해 true. 비게되는 그때 while문을 탈출한다.
        */
        while(!deque.isEmpty()) {

            // 큐의 맨 앞에 있는, 처리해야 할 좌표를 가져온다.
            int[] current = deque.pollFirst();

            int cx = current[0];
            int cy = current[1];

            // 이제 처리해야할 현재 좌표를 갖고왔으니 상하좌우 탐색을 진행한다. dx dy technic을 이용한다.
            for (int i = 0; i < 4; i++) {

                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 이 값이 범위를 벗어나진 않는지
                if (!isRange(nx, ny, n, m)) {
                    continue;
                }
                // 이 값이 0이거나 방문한 적이 있는지
                if (graph[nx][ny] == 0 || visited[nx][ny]) {
                    continue;
                }

                // 모든 조건에 방문처리를 진행한 후 큐에 넣는다.
                visited[nx][ny] = true;
                deque.addLast(new int[]{nx, ny});
            }
        }
    }
    // 조건에 모두 부합해야만 true. 그렇지 않다면 false
    static boolean isRange(int nx, int ny, int n, int m) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}