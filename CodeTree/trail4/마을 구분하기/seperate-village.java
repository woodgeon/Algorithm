import java.util.*;

public class Main {

    static int[][] grid;
    static boolean[][] visited;
    static int count;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        grid = new int[n][n];
        List<Integer> peoples = new ArrayList<>();
        visited = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] != 0) {
                    count = 0;
                    dfs(i, j, n);
                    peoples.add(count);
                }
            }
        }

        System.out.println(peoples.size());
        int[] arr = peoples.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    static void dfs(int cx, int cy, int n) {
        visited[cx][cy] = true;
        count++;
        for (int i = 0; i < 4; i++) {
            int nx = cx + dx[i];
            int ny = cy + dy[i];

            if (!isRange(nx, ny, n)) {
                continue;
            }
            if (visited[nx][ny] || grid[nx][ny] == 0) {
                continue;
            }
            dfs(nx, ny, n);
        }
    }

    static boolean isRange(int nx, int ny, int n) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
}