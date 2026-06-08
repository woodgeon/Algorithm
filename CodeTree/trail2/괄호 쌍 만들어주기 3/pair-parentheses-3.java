import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char open = str.charAt(i);
            if (open == '(') {
                for (int j = i; j < str.length(); j++) {
                    char close = str.charAt(j);
                    if (close == ')') count++;
                }
            }
        }
        System.out.print(count);
    }
}