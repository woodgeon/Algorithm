import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        System.out.print(untilOne(n, count));
    }
    static int untilOne(int n, int count) {
        if (n == 1) {
            return count;
        }
        if (n % 2 == 1) {
            n /= 3;
            count++;
        }
        else {
            n /= 2;
            count++;
        }
        return untilOne(n, count);
    }
}