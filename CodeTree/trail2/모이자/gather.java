import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] range = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            range[i] = a;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.abs(j - i) * range[j];
            }
            min = Math.min(min, sum);
        }
        System.out.print(min);
    }
}