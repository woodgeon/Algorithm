import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int index = 0;
        List<Integer> moving = new ArrayList<Integer>();
        moving.add(0);
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
        
            for (int j = 0; j < t; j++) {
                index += v;
                moving.add(index);
            }
        }

        int index2 = 0;
        List<Integer> moving2 = new ArrayList<Integer>();
        moving2.add(0);
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                index2 += v;
                moving2.add(index2);
            }
        }

        int before = 0;
        int count = 0;
        for (int i = 1; i < moving.size(); i++) {
            int now;

            if (moving.get(i) > moving2.get(i)) {
                now = 1;
            }
            else if (moving.get(i) < moving2.get(i)) {
                now = 2;
            }
            else {
                now = 0;
            }
            if (now == 0) continue;
            
            if (before != 0 && before != now) {
                count++;
            }
            before = now;
        }
        System.out.print(count);
    }
}