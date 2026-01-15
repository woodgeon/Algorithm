import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int k = (int) Math.round(n * 0.15);

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            deque.offerLast(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            deque.pollFirst();
            deque.pollLast();
        }

        double sum = 0;
        int i = 0;
        while (!deque.isEmpty()) {
            sum += deque.pollFirst();
            i++;
        }
        System.out.println(Math.round(sum / i));

    }
}