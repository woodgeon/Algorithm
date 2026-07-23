import java.util.*;

public class Main {
    
    static int n;
    static int[] memo;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.print(square(0));
    }
    // width에서 n까지 가는 경우의 수를 반환하는 함수
    static int square(int width) {
        if (width > n) {
            return 0;
        }
        if (width == n) {
            return 1;
        }
        // -1이 아니다 -> 이미 메모이제이션 끝난 값이므로 그대로 return
        if (memo[width] != -1) {
            return memo[width];
        }

        memo[width] = square(width + 1) + square(width + 2);

        return memo[width] % 10007;
    }
}