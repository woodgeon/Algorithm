import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printNumReverse(n);
    }
    static void printNumReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumReverse(n-1);
        System.out.print(n + " ");
    }
}