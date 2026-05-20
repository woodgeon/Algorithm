import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        seqNumArr(a, b);
    }
    static void seqNumArr(int[] a, int[] b) {
        for (int i = 0; i <= a.length - b.length; i++) {

            boolean flag = true;

            for (int j = 0; j < b.length; j++) {

                if (a[i + j] != b[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}