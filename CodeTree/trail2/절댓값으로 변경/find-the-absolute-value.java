import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arrAbs(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    static void arrAbs(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(arr[i]);
        }
    }
}