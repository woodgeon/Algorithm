import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.print(strIndex(str1, str2));
    }
    static int strIndex(String str1, String str2) {
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    flag = false;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}