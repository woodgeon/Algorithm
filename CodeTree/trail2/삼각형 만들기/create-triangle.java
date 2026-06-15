import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
    
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int area = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || k == i) continue;

                    // i와 x축이 같으면 (세로 관계) / i와 y축이 같으면 (가로 관계)
                    if (x[i] == x[j] && y[i] == y[k]) {
                        area = Math.max(area, Math.abs(y[i] - y[j]) * Math.abs(x[i] - x[k]));
                    }
                }
            }
        }

        if (area == Integer.MIN_VALUE) {
            System.out.print(0);
        }
        else {
            System.out.print(area);
        }
    }
}