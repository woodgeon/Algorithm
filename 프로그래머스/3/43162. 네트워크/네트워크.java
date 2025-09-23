class Solution {
    private static boolean[] visited;
    private static int[][] computer;
    
    private static void dfs(int now) {
        visited[now] = true;
        for (int i = 0; i < computer[now].length; i++) {
            // 연결되어 있으며 방문하지 않은 노드라면
            if (!visited[i] && computer[now][i] == 1) {
                dfs(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        computer = computers;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
}