import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.addFirst(i);
        }
        while(true) {
            if (deque.size() == 1) {
                System.out.print(deque.peekFirst());
                break;
            }
            deque.pollLast();
            deque.addFirst(deque.pollLast());
        }
        
    }
}