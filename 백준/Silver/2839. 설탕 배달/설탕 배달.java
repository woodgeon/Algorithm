import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int five = N / 5;

        while (five >= 0) {
            int rest = N - five * 5;
            if (rest % 3 == 0) {
                System.out.println(five + rest / 3);
                return;
            }
            five--;
        }
        System.out.println(-1);
    }
}