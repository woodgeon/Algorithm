import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        isExistence(m, d);
    }
    static void isExistence(int m, int d) {
        if (m <= 12) {
            if (m == 2) {
                if (d <= 28) {
                    System.out.print("Yes");
                    return;
                }
            }
            else {
                if (m <= 7) {
                    if (m % 2 == 1) {
                        if (d <= 31) {
                            System.out.print("Yes");
                            return;
                        }
                    }
                    else {
                        if (d <= 30) {
                            System.out.print("Yes");
                            return;
                       }
                    }
                }
                else {
                    if (m % 2 == 0) {
                        if (d <= 31) {
                            System.out.print("Yes");
                            return;
                        }
                    }
                    else {
                        if (d <= 30) {
                            System.out.print("Yes");
                            return;
                        }
                    }
                }
            }
        }
        System.out.print("No");
    }
}