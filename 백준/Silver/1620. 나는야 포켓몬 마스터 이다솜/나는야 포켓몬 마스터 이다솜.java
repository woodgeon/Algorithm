import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] names = new String[N + 1];
        Map<String, Integer> map = new HashMap<>(N * 2);

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, i);
            names[i] = name;
        }

        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            String q =  br.readLine();
            if (Character.isDigit(q.charAt(0))) { // 숫자인 경우
                int num = Integer.parseInt(q);
                sb.append(names[num]).append('\n');
            }
            else {
                sb.append(map.get(q)).append('\n');
            }
        }

        System.out.println(sb.toString());

    }
}