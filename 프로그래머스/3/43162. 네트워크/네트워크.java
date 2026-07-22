import java.util.*;

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
        visited[current] = true;
        
        for (int i = 0; i < n; i++) {
            if (grid[current][i] != 0 && !visited[i]) {
                dfs(i, n);
            }
        }
    }
}