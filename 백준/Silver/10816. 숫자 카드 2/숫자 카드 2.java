import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int lowerBound(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (arr[mid] >= target) // target이 처음 등장하는 그 인덱스
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo;
    };
    static int upperBound(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (arr[mid] > target) // target보다 큰 값이 등장하는 인덱스
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo;
    };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());
            int cnt = upperBound(numbers, x) - lowerBound(numbers, x);
            sb.append(cnt);
            if (i < M - 1) sb.append(' ');
        }
        System.out.println(sb);
    }
}