import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.abs(i - a) <= 2 || Math.abs(j - b) <= 2 || Math.abs(k - c) <= 2) {
                        count++;
                        continue;
                    }
                }
            }
        }
        System.out.print(count);
    }
}