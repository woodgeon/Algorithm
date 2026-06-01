import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int OFFSET = 100;
        boolean[][] visited = new boolean[201][201];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            for (int j = x1; j < x2; j++) { // 0~3
                for (int k = y1; k < y2; k++) { // 1~4
                    visited[j + OFFSET][k + OFFSET] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (visited[i][j] == true) count++;
            }
        }
        System.out.print(count);
    }
}