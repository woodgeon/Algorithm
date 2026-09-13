import java.util.*;

class Solution {

    static List<Integer>[] graph;
    static boolean[] visited;

    static int count = 0;
    
    public int solution(int n, int[][] connections) {

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] connection : connections) {
            int a = connection[0];
            int b = connection[1];

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);
        
        
        return count;
    }

    public void dfs(int current) {

        visited[current] = true;

        for (int next : graph[current]) {
            if (!visited[next]) {
                count++;
                dfs(next);
            }
        }
    }
}
