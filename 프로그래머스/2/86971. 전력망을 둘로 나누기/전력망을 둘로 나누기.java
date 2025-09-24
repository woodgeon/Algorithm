import java.util.*;

class Solution {
    private static boolean[] visited;
    private static ArrayList<Integer>[] adjList;
    private static int N, answer;

    public static int solution(int n, int[][] wires) {
        N = n;
        answer = n - 1;

        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= n ; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int[] edge : wires) {
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }

        visited = new boolean[n + 1];
        dfs(1);
        return answer;
    }

    public static int dfs(int now) {
        visited[now] = true;

        // 자식 노드의 수를 저장하고 반환할 변수 선언
        int sum = 0;

        for (int next : adjList[now]) {
            if (!visited[next]) {
                // (전체 노드 - 자식 트리의 노드 수) - (자식 트리의 노드 수) 의 절댓값이 가장 작은 값을 구함
                int cnt = dfs(next); // 자식 트리가 가진 노드의 수
                answer = Math.min(answer, Math.abs(N - cnt * 2));
                // 자식 노드 수를 더함
                sum += cnt;
            }
        }

        return sum + 1;
    }
}