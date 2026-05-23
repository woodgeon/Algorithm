import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(func(n));
    }
    static int func(int n) {
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }
        return (func(n - 1) * func(n - 2)) % 100;
    }
}