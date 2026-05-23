import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int n = a * b * c;
        System.out.print(funcPlus(n));
    }
    static int funcPlus(int n) {
        if (n < 10) {
            return n;
        }
        return funcPlus(n / 10) + (n % 10);
    }
}