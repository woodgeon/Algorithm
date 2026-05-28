import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int now = (10 * 24 * 60) + (11 * 60) + 11;
        int from = ((a - 1) * 24 * 60) + (b * 60) + c;

        if (now > from) {
            System.out.print("-1");
        }
        else {
            System.out.print(from - now);
        }
    }
}