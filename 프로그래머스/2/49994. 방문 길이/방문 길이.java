import java.util.*;

class Solution {
    public int solution(String dirs) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        int answer = 0;
        
        boolean[][][][] visited = new boolean[11][11][11][11];
        
        int cx = 5;
        int cy = 5;
        
        for (int i = 0; i < dirs.length(); i++) {
            char dir = dirs.charAt(i);
            int dirNum = dirNum(dir);
            
            int nx = cx + dx[dirNum];
            int ny = cy + dy[dirNum];
            
            if (isRange(nx, ny)) {
                if (!visited[cx][cy][nx][ny]) {
                    answer++;
                    visited[cx][cy][nx][ny] = true;
                    visited[nx][ny][cx][cy] = true;
                }
                cx = nx;
                cy = ny;
            }
            
        }

        return answer;
    }
    
    public int dirNum(char dir) {
        int dirNum = 0;
        
        if (dir == 'U') {
            dirNum = 0;
        }
        else if (dir == 'R') {
            dirNum = 1;
        }
        else if (dir == 'D') {
            dirNum = 2;
        }
        else {
            dirNum = 3;
        }
        
        return dirNum;
    }
    
    public boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < 11 &&
            0 <= ny && ny < 11;
    }
}