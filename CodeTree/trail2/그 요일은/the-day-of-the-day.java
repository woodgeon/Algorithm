import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String week = sc.next();
        int weekIndex = 0;
        for (int i = 0; i < weeks.length; i++) {
            if (weeks[i].equals(week)) {
                weekIndex = i;
            }
        }

        int sum2 = d2;
        for (int i = 1; i < m2; i++) {
            sum2 += month[i];
        }   

        int sum1 = d1;
        for (int i = 1; i < m1; i++) {
            sum1 += month[i];
        }   

        int days = sum2 - sum1;
        int count = days / 7;
        int remainingDay = days % 7;
        if (weekIndex <= remainingDay) {
            count++;
        }
        System.out.print(count);

        
        
    }
}