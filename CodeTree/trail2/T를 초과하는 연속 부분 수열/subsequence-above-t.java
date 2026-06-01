import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int before = 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int now = sc.nextInt();
            if (now > t) count++;
            else {
                count = 0;
            }
            if (max < count) max = count;
        }
        if (max < count) max = count;
        System.out.print(max);
    }
}