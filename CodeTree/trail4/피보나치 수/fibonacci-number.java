import java.util.*;

public class Main {

    static int[] memo;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        memo = new int[n + 1];

        Arrays.fill(memo, -1);
        
        System.out.print(fibonacci(n));
    }

    static int fibonacci(int n) {
        if (memo[n] != -1) {
            return memo[n];
        }
        if (n <= 2) {
            memo[n] = 1;
        }
        else {
            memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return memo[n];
    }
}