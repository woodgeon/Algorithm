import java.util.*;

class Solution {

    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] parent;
    
    public int[] solution(int n, int[][] edges) {
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[n + 1];
        
        parent = new int[n + 1];
        Arrays.fill(parent, -1);

        for (int[] current : edges) {
            int a = current[0];
            int b = current[1];

            graph[a].add(b);
            graph[b].add(a);
        }

        bfs(1);
        
        if (!visited[n]) {
            return new int[0];
        }
        List<Integer> path = new ArrayList<>();
        int cur = n;

        while (cur != -1) {
            path.add(cur);
            cur = parent[cur];
        }

        Collections.reverse(path);

        int[] answer = new int[path.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = path.get(i);
        }

        return answer;
        
    }

    public void bfs(int start) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(start);
        visited[start] = true;

        while(!deque.isEmpty()) {
            int cur = deque.pollFirst();

            for (int next : graph[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    // next의 부모는 cur. -> cur에서 왔다.
                    parent[next] = cur;
                    deque.offerLast(next);
                }
            }
        }
    }
}
