import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[200000];
        int count = 100000;

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            String str = sc.next();

            if (str.charAt(0) == 'R') {
                for (int j = 0; j < v; j++) {
                    arr[count]++;
                    count++;
                }
            } else {
                for (int j = 0; j < v; j++) {
                    count--;
                    arr[count]++;
                }
            }
        }

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                result++;
            }
        }

        System.out.print(result);
    }
}