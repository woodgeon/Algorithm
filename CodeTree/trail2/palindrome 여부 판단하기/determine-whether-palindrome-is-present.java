import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        palindrome(str);
    }
    static void palindrome(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - i - 1);
            if (c1 != c2) {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }

}