import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printString(n);
    }
    static void printString(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("12345^&*()_");
        }
    }
}