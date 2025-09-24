import java.util.ArrayDeque;
class Solution {
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    private static class Pointer {
        int nx, ny;

        public Pointer(int nx, int ny) {
            this.nx = nx;
            this.ny = ny;
        }
    }

    private static char[][] map;
    private static int N, M;

    public int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();

        // 미로에 대한 정보를 배열로 저장
        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = maps[i].toCharArray();
        }

        Pointer start = null, end = null, lever = null;

        // 시작점, 출구, 레버의 위치를 찾는 for문
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'S') {
                    start = new Pointer(i, j);
                }
                if (map[i][j] == 'E') {
                    end = new Pointer(i, j);
                }
                if (map[i][j] == 'L') {
                    lever = new Pointer(i, j);
                }
            }
        }

        // 시작 지점 -> 레버, 레버 -> 출구 까지의 최단 거리를 각각 구함
        int startLever = bfs(start, lever);
        int leverEnd = bfs(lever, end);

        if (startLever == -1 || leverEnd == -1) {
            return -1;
        }
        else {
            return startLever + leverEnd;
        }
    }

    private static int bfs(Pointer start, Pointer end) {
        // 너비 우선 탐색 초기 과정
        int[][] dist = new int[N][M];
        ArrayDeque<Pointer> queue = new ArrayDeque<>();
        dist[start.nx][start.ny] = 1;
        queue.add(start);

        while (!queue.isEmpty()) {
            Pointer now = queue.poll();
            // 네 방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nextX = now.nx + dx[i];
                int nextY = now.ny + dy[i];

                // 범위를 벗어나는 경우 예외 처리
                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) {
                    continue;
                }
                // 아마 방문한 지점인 경우 탐색하지 않음
                if (dist[nextX][nextY] > 0) {
                    continue;
                }
                // X가 아닌 지점만 이동 가능
                if (map[nextX][nextY] == 'X') {
                    continue;
                }

                // 거리 1 증가
                dist[nextX][nextY] = dist[now.nx][now.ny] + 1;

                // 다음 정점을 큐에 넣음
                queue.add(new Pointer(nextX, nextY));

                // 도착점에 도달하면 최단 거리 반환
                if (nextX == end.nx && nextY == end.ny) {
                    return dist[end.nx][end.ny] - 1;
                }
            }
        }
        
        // 탐색을 종료할 때까지 도착점에 도달하지 못했다면 -1 반환
        return -1;
    }
}