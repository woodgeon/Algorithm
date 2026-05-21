import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        checkAlphabet(A);
    }
    static void checkAlphabet(String A) {
        int len = A.length();
        int count = 1;
        for (int i = 1; i < len; i++) {
            char beforeC = A.charAt(i - 1);
            char afterC = A.charAt(i);
            if (beforeC != afterC) count++;
            if (count >= 2) {
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}