//  큐

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                queue.offerFirst(Integer.parseInt(st.nextToken()));
            }
            else if (command.equals("pop")) {
                System.out.println(queue.isEmpty() ? -1 : queue.pollLast());
            }
            else if (command.equals("front")) {
                System.out.println(queue.isEmpty() ? -1 : queue.peekLast());
            }
            else if (command.equals("back")) {
                System.out.println(queue.isEmpty() ? -1 : queue.peekFirst());
            }
            else if (command.equals("size")) {
                System.out.println(queue.size());
            }
            else if (command.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            }
        }

    }
}