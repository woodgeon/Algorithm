import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            num = num * 2 + n;
        }
        System.out.print(num);
    }
}