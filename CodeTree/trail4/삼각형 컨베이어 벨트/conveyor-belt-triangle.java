import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] arr = new int[3][n];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        triConveyor(arr, n, t);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void triConveyor(int[][] arr, int n, int t) {

        for (int i = 0; i < t; i++) {

            int temp1 = arr[0][n - 1];
            for (int j = n - 1; j >= 1; j--) {
                arr[0][j] = arr[0][j - 1];
                
            }

            int temp2 = arr[1][n - 1];
            for (int j = n - 1; j >= 1; j--) {
                arr[1][j] = arr[1][j - 1];
            }


            int temp3 = arr[2][n - 1];
            for (int j = n - 1; j >= 1; j--) {
                arr[2][j] = arr[2][j - 1];
            }

            arr[1][0] = temp1;
            arr[2][0] = temp2;
            arr[0][0] = temp3;
        }
        
    }
}