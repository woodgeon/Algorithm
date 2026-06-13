import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                int length = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    length++;
                }
                for (int k = i; k <= j; k++) {
                    if (arr[k] * length == sum) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.print(count);
    }
}