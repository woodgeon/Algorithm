import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        System.out.print(sumPrime(n, m));
    }
    static int sumPrime(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m ; i++) {
            if(isPrime(i)) sum += i;
        }
        return sum;
    }
    static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) flag = false;
        }
        return flag;
    }
}