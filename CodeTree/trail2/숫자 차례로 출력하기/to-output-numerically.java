import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNum(n);
        System.out.println();
        reversePrintNum(n);
    }
    static void printNum(int n) {
        if (n == 0) {
            return;
        }
        printNum(n - 1);
        System.out.print(n + " ");
    }
    static void reversePrintNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        reversePrintNum(n - 1);
    }
}