import java.util.*;

class Solution {
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    static List<Integer> answer = new ArrayList<>();
    static boolean[][] visited;
    
    static int[] rx = {0, 1, 2, 1, 0, -1, -2, -1};
    static int[] ry = {2, 1, 0, -1, -2, -1, 0, 1};
    
    public int[] solution(String[][] places) {
        
        for (String[] arr : places) {
            keepDistance(arr);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    static void keepDistance(String[] arr) {
        char[][] grid = new char[5][5];
        for (int i = 0; i < arr.length; i++) {
            String table = arr[i];
            for (int j = 0; j < table.length(); j++) {
                grid[i][j] = table.charAt(j);
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // 1. 만약 현재 grid값이 P가 아니라면 continue;
                if (grid[i][j] != 'P') {
                    continue;
                }
                
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    
                    if (!isRange(nx, ny)) {
                        continue;
                    }
                    
                    if (grid[nx][ny] == 'P') {
                        answer.add(0);
                        return;
                    }
                }
                
                // 2. 맨해튼거리 2 이내에 P가 있는지 검사.
                for (int k = 0; k < 8; k++) {
                    int nx = i + rx[k];
                    int ny = j + ry[k];
                    
                    if (!isRange(nx, ny)) {
                        continue;
                    }
                
                    if (grid[nx][ny] == 'P') {
                        // 시작한 P위치와 찾은 P위치를 보내서 파티션이 있는지 확인합니다
                        if (!dxdy(i, j, k, grid)) {
                            System.out.println(i + " " + j + " to " + nx + " " + ny);
                            answer.add(0);
                            return;
                        }
                    }
                }
            }
        }
        // 아무런 일도 없이 여기까지 왔으면 다 거리두기 지키고 있는 거임. 1 add 해줍시다
        answer.add(1);
    }
    /* 
    현재 위치 기준 상하좌우에 
    1. 범위를 벗어나지 않고 X인 게 있다면
    2. 막혀있지 않고 뚫린 거니까 return true;
    아니라면 false;
    */
    static boolean dxdy(int cx, int cy, int k, char[][] grid) {
        if (k == 0) {
            if (grid[cx][cy + dy[0]] == 'O') {
                return false;
            }
        }
        else if (k == 1) {
            if (grid[cx][cy + dy[0]] == 'O') {
                return false;
            }
            if (grid[cx + dx[1]][cy] == 'O') {
                return false;
            }
        }
        else if (k == 2) {
            if (grid[cx + dx[1]][cy] == 'O') {
                return false;
            }
        }
        else if (k == 3) {
            if (grid[cx + dx[1]][cy] == 'O') {
                return false;
            }
            if (grid[cx][cy + dy[2]] == 'O') {
                return false;
            }
        }
        else if (k == 4) {
            if (grid[cx][cy + dy[2]] == 'O') {
                return false;
            }
        }
        else if (k == 5) {
            if (grid[cx][cy + dy[2]] == 'O') {
                return false;
            }
            if (grid[cx + dx[3]][cy] == 'O') {
                return false;
            }
        }
        else if (k == 6) {
            if (grid[cx][cy + dy[3]] == 'O') {
                return false;
            }
        }
        else {
            if (grid[cx][cy + dy[3]] == 'O') {
                return false;
            }
            if (grid[cx + dx[0]][cy] == 'O') {
                return false;
            }
        }
        
        return true;
    }
    
    static boolean isRange(int nx, int ny) {
        return 0 <= nx && nx < 5 && 0 <= ny && ny < 5;
    }
}