import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factSqure(n));
    }
    static int factSqure(int n) {
        if (n < 10) {
            return n * n;
        }

        return factSqure(n / 10) + factSqure(n % 10) ;
    }
}