import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(A, x)).append("\n");
        }

        System.out.println(sb.toString());

    }

    /**
     * @param arr 정렬된 배열
     * @param key 찾고자하는 값
     * @return key와 일치하는 배열의 인덱스
     */
    public static int binarySearch(int arr[], int key) {

        int lo = 0; // 배열의 왼쪽 끝 인덱스
        int hi = arr.length - 1; // 배열의 오른쪽 끝 인덱스
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if (arr[mid] == key) return 1;
            else if (arr[mid] < key) lo = mid + 1;
            else hi = mid - 1;
        }
        return 0;
    }
}