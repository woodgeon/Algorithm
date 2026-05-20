import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        System.out.print(countPrimeEven(a, b));
    }

    static int countPrimeEven(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (primeNum(i)) {
                int tens = i / 10;
                int ones = i % 10;
                if ((tens + ones) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    static boolean primeNum(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}