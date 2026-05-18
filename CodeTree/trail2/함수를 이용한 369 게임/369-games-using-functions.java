import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(countThreeSixNine(n, m));
    }
    static int countThreeSixNine(int n, int m) {
        int count = 0;

        for (int i = n; i <= m; i++) {
            if (i % 3 == 0) {
                count++;
                continue;
            }
            else {
                String str = Integer.toString(i);
                for (int j = 0; j < str.length(); j++) {
                    int num = str.charAt(j) - '0';
                    if (num == 3 || num == 6 || num == 9) {
                        count++;
                        break;
                    }
                }
            }
        }

        return count;
    }
}