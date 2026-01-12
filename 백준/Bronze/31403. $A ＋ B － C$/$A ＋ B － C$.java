import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(a + b - c);

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        System.out.println(Integer.parseInt(sb.toString()) - c);
    }
}