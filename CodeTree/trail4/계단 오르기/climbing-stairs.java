import java.util.*;
public class Main {

    static int n;
    static int[] memo;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        memo = new int[n + 1];
        Arrays.fill(memo, -1);

        System.out.print(stair(0));
    }

    static int stair(int sum) {
        if (sum > n) {
            return 0;
        }
        if (sum == n) {
            return 1;
        }

        if (memo[sum] != -1) {
            return memo[sum];
        }

        memo[sum] = (stair(sum + 2) + stair(sum + 3)) % 10007;
        
        return memo[sum];
    }
}