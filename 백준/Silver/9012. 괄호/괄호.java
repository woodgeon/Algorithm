import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String vps = br.readLine();
            Deque<Character> stack = new ArrayDeque<>();
            boolean ok = true;
            for (int j = 0; j < vps.length(); j++) {
                char c = vps.charAt(j);
                if (c == '(') {
                    stack.push(c);
                }
                else {
                    if (stack.isEmpty()) {
                        ok = false;
                        break;
                    }
                    stack.pop();
                }
            }
            System.out.println(ok && stack.isEmpty() ? "YES" : "NO");
        }

    }
}