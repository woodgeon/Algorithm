import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] students = new int[n + 1];
        
        int m = sc.nextInt();
        int k = sc.nextInt();

        int result = -1;
        for (int i = 0; i < m; i++) {
            int no = sc.nextInt();
            students[no]++;
            if (students[no] >= k) {
                result = no;
                break;
            }
        }
        System.out.print(result);
    }
}