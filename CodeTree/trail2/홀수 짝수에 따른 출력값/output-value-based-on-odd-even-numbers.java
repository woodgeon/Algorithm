import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(evenOdd(n));
    }
    static int evenOdd(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + evenOdd(n - 2);
    }
}