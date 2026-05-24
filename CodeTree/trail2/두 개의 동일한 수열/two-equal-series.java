import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                flag = false;
            }
        }
        if (flag) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}