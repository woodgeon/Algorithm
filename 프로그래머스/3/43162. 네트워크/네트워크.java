class Solution {
    
    static int[][] graph;
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        graph = computers;
        visited = new boolean[n];
        
        for (int current = 0; current < n; current++) {

            if (!visited[current]) {
                dfs(current, n);
                answer++;
            }
        }
        
        return answer;
    }
    
    static void dfs(int current, int n) {
        visited[current] = true;
        
        for (int i = 0; i < n; i++) {
            if (graph[current][i] != 0 && !visited[i]) {
                dfs(i, n);
            }
        }
    }
}