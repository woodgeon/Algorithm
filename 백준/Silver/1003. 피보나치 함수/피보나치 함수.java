//  피보나치 함수

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int[][] arr = new int[41][2];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = -1;
            }
        }

        arr[0][0] = 1; // N = 0일 때 0이 호출되는 횟수
        arr[0][1] = 0; // N = 0일 때 1이 호출되는 횟수
        arr[1][0] = 0; // N = 1일 때 0이 호출되는 횟수
        arr[1][1] = 1; // N = 1일 때 1이 호출되는 횟수

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(arr[N][0] + " " + arr[N][1]).append("\n");
        }

        System.out.println(sb.toString());
    }

    static int[] fibonacci(int n) {
        if (arr[n][0] == -1 || arr[n][1] == -1) {
            arr[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            arr[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return arr[n];
    }
}

