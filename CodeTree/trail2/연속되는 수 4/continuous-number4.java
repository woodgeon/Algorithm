import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int before = 0;
        int max = 1;
        int count = 1;
        for (int i = 0; i < n; i++) {
            int now = sc.nextInt();

            if (i == 0) {
                before = now;
                continue;
            }

            if (before < now) {
                count++;
            }
            else {
                count = 1;
            }

            before = now;
            
            if (max < count) max = count;
        }
        if (max < count) max = count;
        System.out.print(max);
    }
}