import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHelloWorld(n);
    }
    static void printHelloWorld(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("HelloWorld");
        printHelloWorld(n - 1);
    }
}