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

        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                int xVector = x[i] - x[j];
                int yVector = y[i] - y[j];
                int tempDistance = (xVector * xVector) + (yVector * yVector);
                distance = Math.min(distance, tempDistance);
            }
        }
        System.out.print(distance);
    }
}