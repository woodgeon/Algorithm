import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[20];

        String str = sc.next();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            num = num * a + n;
        }
        
        
        int cnt = 0;
        while (true) {
            if (num < b) {
                arr[cnt++] = num;
                break;
            }
            arr[cnt++] = num % b;
            num /= b;
        }
        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}