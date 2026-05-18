import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(evenAndFive(n));
    }
    static String evenAndFive(int n) {
        if (n % 2 == 0) {
            int first = n / 10;
            n = n % 10;
            if ((first + n) % 5 == 0) {
                return "Yes";
            }
            else return "No";
        }
        return "No";
    }
}