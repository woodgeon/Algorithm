import java.util.*;

public class Main {

    static int[][] grid;
    static boolean[] visited;

    static int n;
    static int max = 0;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        visited = new boolean[n];
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        choose(0, 0);
        System.out.print(max);
    }

    static void choose(int row, int sum) {
        if (row == n) {
            
            max = Math.max(max, sum);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (visited[col]) {
                continue;
            }

            visited[col] = true;
            choose(row + 1, sum + grid[row][col]);
            visited[col] = false;
        }
    }
}