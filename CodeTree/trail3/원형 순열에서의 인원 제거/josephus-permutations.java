import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        int count = 1;
        while (!q.isEmpty()) {
            if (count == k) {
                System.out.print(q.poll() + " ");
                count = 1;
            }
            else {
                q.add(q.poll());
                count++;
            }
        }
    }
}