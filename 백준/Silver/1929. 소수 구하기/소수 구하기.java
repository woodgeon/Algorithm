import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (!isPrime[i]) continue;

            for (int j = i * i; j <= n ; j += i) {
                isPrime[j] = false;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = m; i <= n; i++) {
            if (isPrime[i]) sb.append(i).append("\n");
        }
        System.out.println(sb.toString());

    }
}