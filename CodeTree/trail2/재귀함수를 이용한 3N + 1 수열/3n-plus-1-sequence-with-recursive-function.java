import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int count = 0;
        System.out.print(func(n, count));
    }
    static int func(int n, int count) {
        if (n == 1) {
            return count;
        }
        if (n % 2 == 1) {
            n *= 3;
            n++;
        }
        else {
            n /= 2;
        }
        return func(n, ++count);
    }
}