import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cows = new int[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            cows[i] = height;
        }

        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    
                    if (cows[i] <= cows[j]&& cows[j] <= cows[k]) count++;
                }
            }
        }

        System.out.print(count);
    }
}