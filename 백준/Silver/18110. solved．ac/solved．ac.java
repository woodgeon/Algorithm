import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int k = (int) Math.round(n * 0.15);
        int start = k;
        int end = n - k;
        int cnt = end - start;

        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        long avg = Math.round((double) sum / cnt);
        System.out.println(avg);


    }
}