import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[201];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() + 100;
            int b = sc.nextInt() + 100;
            for (int j = a; j < b; j++) {
                arr[j]++;
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        System.out.print(max);
    }
}