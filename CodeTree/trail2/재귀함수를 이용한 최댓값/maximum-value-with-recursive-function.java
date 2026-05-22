import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = 0;
        System.out.print(recursionMax(arr, max, n - 1));
    }
    static int recursionMax(int[] arr, int max, int n) {
        if (n < 0) {
            return max;
        }
        if (max < arr[n]) max = arr[n];

        return recursionMax(arr, max, --n);
    }
}