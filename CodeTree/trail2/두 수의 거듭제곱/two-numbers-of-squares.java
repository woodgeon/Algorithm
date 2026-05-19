import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.print(squreNum(n, m));
    }

    static int squreNum(int n, int m) {
        int num = n;
        for (int i = 1; i < m; i++) {
            n = n * num;
        }
        return n;
    }
    
}