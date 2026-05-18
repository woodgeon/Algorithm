import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(leapYear(n));
    }
    static boolean leapYear(int n) {
        boolean flag = false;
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 != 0) {
                    flag = false;
                    return flag;
                }
            }
            flag = true;
        }
        return flag;
    }
}