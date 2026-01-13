import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int q = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(q, 0));
            if (i < M - 1) sb.append(' ');
        }
        System.out.println(sb);
    }
}