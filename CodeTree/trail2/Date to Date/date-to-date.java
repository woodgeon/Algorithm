import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int sum2 = d2;
        for (int i = 1; i < m2; i++) {
            sum2 += month[i];
        }

        int sum1 = d1;
        for (int i = 1; i < m1; i++) {
            sum1 += month[i];
        }

        System.out.print(sum2 - sum1 + 1);
    }
}