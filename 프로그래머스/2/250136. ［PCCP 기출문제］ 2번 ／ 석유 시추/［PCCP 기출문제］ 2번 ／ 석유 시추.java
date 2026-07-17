import java.util.*;

class Solution {
    
    static boolean[][] visited;
    static int[][] grid;
    static int[][] oilGrid;
    
    static int n;
    static int m;
    static int max = 0;
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    static int curIndex = -1;
    static List<Integer> oils = new ArrayList<>();
    
    public int solution(int[][] land) {
        grid = land;
        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];
        oilGrid = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                oilGrid[i][j] = -1;
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[j][i] == 1 && !visited[j][i]) {
                    bfs(j, i);
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            boolean[] counted = new boolean[oils.size()];
            int currentOil = 0;
            for (int j = 0; j < n; j++) {
                if (oilGrid[j][i] != -1 && !counted[oilGrid[j][i]]) {
                    currentOil += oils.get(oilGrid[j][i]);
                    counted[oilGrid[j][i]] = true;
                }
            }
            max = Math.max(max, currentOil);
        }
        
        
        return max;
    }
    
    static void bfs(int startX, int startY) {
        Deque<int[]> deque = new ArrayDeque<>();
        
        visited[startX][startY] = true;
        curIndex++;
        oilGrid[startX][startY] = curIndex;
        int tempMax = 1;
        deque.offerLast(new int[]{startX, startY});
        
        while(!deque.isEmpty()) {
            int[] current = deque.pollFirst();
            
            int cx = current[0];
            int cy = current[1];
            for (int i = 0; i < 4; i++) {
                
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (!isRange(nx, ny)) {
                    continue;
                }
                
                if (visited[nx][ny] || grid[nx][ny] == 0) {
                    continue;
                }
                
                tempMax++;
                visited[nx][ny] = true;
                oilGrid[nx][ny] = curIndex;
                deque.offerLast(new int[]{nx, ny});
                
            }
        }
        oils.add(tempMax);
    }
    
    static boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }
}