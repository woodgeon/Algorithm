import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * 1. K보다 작거나 같은 동전값으로 K를 나눈다.
 * 1-1. 예를들면 4200원은 1000원보다 크고 5000원보다 작으므로 1000원을 기준으로 1000원보다 작아질 때까지 1000원으로 반복.
 * 1-2. 그럼 200원이 남는데, 200원은 100원보다 크고 500원보다 작으므로 100원보다 작아질 때까지 100뭔으로.
 * 1-3. 위 경우 딱 맞아떨어지므로 쉬운 TC이나 4796같은 개같은 TC의 경우도 있다. 그러나 같은 조건을 적용하여 뺀다면 문제 없다.
 */

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (K == 0) break;
            if (coins[i] <= K) {
                cnt += K / coins[i];
                K %= coins[i];
            }
        }

        System.out.println(cnt);

    }
}