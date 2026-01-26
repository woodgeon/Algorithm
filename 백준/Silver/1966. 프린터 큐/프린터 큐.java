import java.io.*;
import java.util.*;

class Main {
    static class Doc {
        int p;
        boolean target;
        Doc(int p, boolean target) {
            this.p = p;
            this.target = target;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Deque<Doc> queue = new ArrayDeque<>();
            int[] cnt = new int[10];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                int priority = Integer.parseInt(st.nextToken());
                boolean isTarget = (i == m);
                queue.offerLast(new Doc(priority, isTarget));
                cnt[priority]++;
            }

            int max = 9;
            while (max >= 1 && cnt[max] == 0) max--;

            int printed = 0;

            while (!queue.isEmpty()) {
                Doc cur = queue.pollFirst();

                if (cur.p < max) {
                    queue.offerLast(cur);
                } else {
                    printed++;
                    cnt[cur.p]--;
                    if (cur.target) {
                        sb.append(printed).append('\n');
                        break;
                    }
                    while (max >= 1 && cnt[max] == 0) max--;
                }
            }
        }

        System.out.print(sb.toString());
    }
}