import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = n * 2;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (max < arr[i] + arr[len - 1 - i]) {
                max = arr[i] + arr[len - 1 - i];
            }
        }
        System.out.print(max);
    }
}