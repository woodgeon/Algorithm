import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.print(divideAndMinusPlus(arr, m));
    }
    static int divideAndMinusPlus(int[] arr, int m) {
        int sum = arr[m];
        while (true) {
            if (m == 1) break;
            if (m % 2 == 1) {
                m--;
                sum += arr[m];
            }
            else {
                m /= 2;
                sum += arr[m];
            }
        }
        return sum;
    }
}