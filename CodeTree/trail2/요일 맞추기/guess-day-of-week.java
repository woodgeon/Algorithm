import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; 
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int sum2 = d2;
        for (int i = 1; i < m2; i++) {
            sum2 += month[i];
        }

        int sum1 = d1;
        for (int i = 1; i < m1; i++) {
            sum1 += month[i];
        }

        int days = sum2 - sum1;
        int dayOfWeek = days % 7;
        if (dayOfWeek < 0) {
            dayOfWeek += 7;
        }
        System.out.print(week[dayOfWeek]);
       
    }
}