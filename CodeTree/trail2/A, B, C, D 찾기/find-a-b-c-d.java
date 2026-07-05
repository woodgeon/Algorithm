import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];

        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];

        int c = 0;
        int d = 0;
        for (int i = 0; i < 15; i++) {
            if (arr[i] <= a + b) {
                int temp = (arr[14]) - (arr[i] + a + b);
                for (int j = 0; j < 15; j++) {
                    if (temp == arr[j]) {
                        c = arr[i];
                        d = temp;
                        break;
                    }
                }
                if (d != 0) {
                    break;
                }
            }
        }

        System.out.print(a + " " + b + " " + c + " " + d);
    }
}