import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] a1 = new int[]{a};
        int b = sc.nextInt();
        int[] b1 = new int[]{b};

        if (a1[0] < b1[0]) {
            a1[0] += 10;
            b1[0] *= 2;
        }
        else {
            b1[0] += 10;
            a1[0] *= 2;
        }

        System.out.print(a1[0] + " " + b1[0]);
    }
    static void swap(int[] a1, int[] b1) {
        int temp = a1[0];
        a1[0] = b1[0];
        b1[0] = temp;
    }
}