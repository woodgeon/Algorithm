import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        if (n == 1) {
            System.out.print(arr[0]);
        }
        else if (n == 2) {
            System.out.print(getLcm(arr[0], arr[1]));
        }
        else {
            int lcm = getLcm(arr[0], arr[1]);
            for (int i = 2; i < n; i++) {
                lcm = getLcm(lcm, arr[i]);
            } 
            System.out.print(lcm);
        }
    }
    static int getGcd(int n, int m) {
        if (m == 0) return n;
        return getGcd(m, n % m);
    }
    static int getLcm(int n, int m) {
        return n * m / getGcd(n, m);
    }
}