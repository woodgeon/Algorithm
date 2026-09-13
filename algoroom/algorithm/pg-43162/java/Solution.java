import java.util.*;

class Solution {

    static int[][] graph;
    static boolean[] visited;
    static int count = 0;
    
    public int solution(int n, int[][] computers) {

        graph = computers;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }
        
        return count;
    }
    public void dfs(int current) {
        visited[current] = true;

        for (int next = 0; next < graph[current].length; next++) {
            if (graph[current][next] == 1 && !visited[next]) {
                dfs(next);
            }   
        }
    }
}
