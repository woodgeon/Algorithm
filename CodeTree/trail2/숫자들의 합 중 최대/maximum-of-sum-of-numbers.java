import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int max = Integer.MIN_VALUE;
        for (int i = x; i <= y; i++) {
            String str = Integer.toString(i);
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                int temp = str.charAt(j) - '0';
                sum += temp;
            }
            max = Math.max(sum, max);
        }
        System.out.print(max);
    }
}