import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        isExistence(y, m, d);
    }
    static void isExistence(int y, int m, int d) {
        int[] maxDays;
        if (isLeap(y)) {
            maxDays = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
        else {
            maxDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
        if (maxDays[m] < d) {
            System.out.print("-1");
            return;
        }
        if (m >= 3 && m <= 5) {
            System.out.print("Spring");
            return;
        }
        else if (m >= 6 && m <= 8) {
            System.out.print("Summer");
            return;
        }
        else if (m >= 9 && m <= 11) {
            System.out.print("Fall");
            return;
        }
        else if (m == 12 || m <= 2) {
            System.out.print("Winter");
            return;
        }
    }
    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}