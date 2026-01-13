import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if (command.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            }
            else if (command.equals("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
            else if (command.equals("size")) {
                System.out.println(stack.size());
            }
            else if (command.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
        }
    }
}