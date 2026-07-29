class Solution {
    
    static int[][] grid;
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        grid = new int[n][n];
        visited = new boolean[n];
        
        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[0].length; j++) {
                grid[i][j] = computers[i][j];
            }
        }
        
        for (int current = 0; current < n; current++) {
            if (!visited[current]) {
                dfs(current, n);
                answer++;
            }
        }
        
        return answer;
    }
    
    static void dfs(int current, int n) {
        // 먼저 방문한다.
        visited[current] = true;
        
        for (int i = 0; i < n; i++) {
            /* 
            만약 이번에 만난 노드가 내가 방문하지 않았던 노드이고,
            그리고 지금 가고자 하는 위치가 1일 때
            더 깊이, 그리고 0부터 시작한다.
            */
            if (!visited[i] && grid[current][i] == 1) {
                dfs(i, n);
            }
        }
    }
}




