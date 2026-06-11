import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] arr = new char[10001];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = '0';
        }

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            char c = sc.next().charAt(0);
            arr[l] = c;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j <= i + k; j++) {
                if (arr[j] == 'G') {
                    sum += 1;
                }
                else if (arr[j] == 'H') {
                    sum += 2;
                }
            }
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}