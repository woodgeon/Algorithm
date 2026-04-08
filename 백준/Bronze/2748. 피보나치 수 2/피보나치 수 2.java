//  피보나치 수 2

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new long[N + 1];

        for (int i = 0; i < N + 1; i++) {
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fib(N));
    }

    public static long fib(int N) {
        if (arr[N] == -1) {
            arr[N] = fib(N - 1) + fib(N - 2);
        }
        return arr[N];
    }
}