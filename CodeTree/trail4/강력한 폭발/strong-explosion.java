import java.util.*;

public class Main {

    static List<Integer> path = new ArrayList<>();
    static int[][] grid;
    static List<int[]> bombs = new ArrayList<>();
    static boolean[][] visited;

    static int n;
    static int max = 0;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                grid[i][j] = num;
                if (num == 1) {
                    bombs.add(new int[]{i, j});
                }
            }
        }

        choose(1);
        System.out.print(max);
    }
    

    static void choose(int current) {
        if (current == bombs.size() + 1) {
            int temp = 0;
            for (int i = 0; i < path.size(); i++) {
                temp += bomb(i, path.get(i));
            }
            max = Math.max(max, temp);
            visited = new boolean[n][n];
            return;
        } 

        for (int i = 1; i < 4; i++) {
            path.add(i);
            choose(current + 1);
            path.remove(path.size() - 1);
        }
    }

    static int bomb(int bombLoc, int type) {
        int count = 1;
        if (type == 1) {
            int[] dx = {1, 2, -1, -2};

            int[] current = bombs.get(bombLoc);
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                boolean flag = true;
                int nx = cx + dx[i];
                
                if (!(0 <= nx && nx < n) || visited[nx][cy]) {
                    continue;
                }

                for (int j = 0; j < bombs.size(); j++) {
                    if (nx == bombs.get(j)[0] && cy == bombs.get(j)[1]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;
                    visited[nx][cy] = true;
                }
            }
        }
        else if (type == 2) {
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};

            int[] current = bombs.get(bombLoc);
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                boolean flag = true;
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (!(0 <= nx && nx < n && 0 <= ny && ny < n) || visited[nx][ny]) {
                    continue;
                }

                for (int j = 0; j < bombs.size(); j++) {
                    if (nx == bombs.get(j)[0] && ny == bombs.get(j)[1]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;
                    visited[nx][ny] = true;
                }
            }
        }
        else {
            int[] dx = {1, 1, -1, -1};
            int[] dy = {-1, 1, 1, -1};

            int[] current = bombs.get(bombLoc);
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                boolean flag = true;
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (!(0 <= nx && nx < n && 0 <= ny && ny < n) || visited[nx][ny]) {
                    continue;
                }

                for (int j = 0; j < bombs.size(); j++) {
                    if (nx == bombs.get(j)[0] && ny == bombs.get(j)[1]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;
                    visited[nx][ny] = true;
                }
            }
        }
        return count;
    }
}