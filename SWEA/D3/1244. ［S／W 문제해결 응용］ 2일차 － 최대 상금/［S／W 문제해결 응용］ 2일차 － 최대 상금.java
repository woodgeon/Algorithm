import java.io.*;
import java.util.*;

class Solution {
    static int K;
    static char[] digits;
    static int best;
    static HashSet<String>[] visited;

    static void dfs(int depth) {
        // K번 교환 완료 값 갱신
        if (depth == K) {
            best = Math.max(best, Integer.parseInt(new String(digits)));
            return;
        }

        // 중복 상태 제거 (depth별)
        String cur = new String(digits);
        if (visited[depth].contains(cur)) return;
        visited[depth].add(cur);

        int n = digits.length;

        // 모든 swap 경우 시도
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(i, j);
                dfs(depth + 1);
                swap(i, j); // 백트래킹 (원복)
            }
        }
    }

    static void swap(int i, int j) {
        char tmp = digits[i];
        digits[i] = digits[j];
        digits[j] = tmp;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            digits = st.nextToken().toCharArray();
            K = Integer.parseInt(st.nextToken());

            best = 0;

            // depth별 방문 체크
            visited = new HashSet[K + 1];
            for (int i = 0; i <= K; i++) {
                visited[i] = new HashSet<>();
            }

            dfs(0);

            sb.append("#").append(tc).append(" ").append(best).append("\n");
        }

        System.out.print(sb.toString());
    }
}