import java.util.*;

class Solution {
    private static final int[] rx = {0, 0, 1, -1};
    private static final int[] ry = {-1, 1, 0, 0};

    private static class Node {
        int r, c;
        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public int solution(int[][] maps) {
        // 게임 맵의 크기를 저장하는 변수 선언
        int N = maps.length; // 가로
        int M = maps[0].length; // 세로

        // 최단 거리를 저장할 배열 선언
        int[][] dist = new int[N][M];

        // bfs 탐색을 위한 큐 선언
        ArrayDeque<Node> queue = new ArrayDeque<>();

        // 시작 정점에 대해서 큐에 추가, 최단 거리 저장
        queue.addLast(new Node(0, 0));
        dist[0][0] = 1;


        // queue가 비어있을 때 까지 반복
        while (!queue.isEmpty()) {
            Node now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nr = now.r + rx[i];
                int nc = now.c + ry[i];
                
                if (nr < 0 || nc < 0 || nr >= N || nc >= M) {
                    continue;
                }
                
                if (maps[nr][nc] == 0) {
                    continue;
                }
                
                // 이동한 위치가 처음 방문하는 경우, 큐에 추가하고 거리 갱신
                if (dist[nr][nc] == 0) {
                    queue.add(new Node(nr, nc));
                    dist[nr][nc] = dist[now.r][now.c] + 1;
                }
                
            }
        }
        
        return dist[N - 1][M - 1] == 0 ? -1 : dist[N - 1][M - 1];
    }
}