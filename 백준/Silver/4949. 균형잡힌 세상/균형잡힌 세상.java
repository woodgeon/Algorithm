//  균형잡힌 세상

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str == null) return;
            if (str.charAt(0) == '.') return;
            Deque<Character> deque = new ArrayDeque<>();
            boolean ok = true;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == '(' || c == '[') {
                    deque.push(c);
                }
                else if (c == ')') {
                    if (deque.isEmpty() || deque.peek() != '(') {
                        ok = false;
                        break;
                    }
                    deque.pop();
                }
                else if (c == ']') {
                    if (deque.isEmpty() || deque.peek() != '[') {
                        ok = false;
                        break;
                    }
                    deque.pop();
                }
            }
            System.out.println(ok && deque.isEmpty() ? "yes" : "no");
        }

    }
}