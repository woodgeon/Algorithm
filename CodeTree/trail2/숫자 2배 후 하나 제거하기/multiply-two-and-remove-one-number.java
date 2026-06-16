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
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] *= 2;
            for (int j = 0; j < n; j++) {
                int[] tempArr = new int[n - 1];
                int index = 0;
                for (int k = 0; k < n; k++) {
                    if (k == j) continue;
                    tempArr[index++] = arr[k];
                }

                int sum = 0;
                for (int k = 0; k < n - 2; k++) {
                    sum += Math.abs(tempArr[k] - tempArr[k + 1]);
                }
                result = Math.min(result, sum);
            }
            arr[i] /= 2;
        }

        System.out.print(result);
        
    }
}