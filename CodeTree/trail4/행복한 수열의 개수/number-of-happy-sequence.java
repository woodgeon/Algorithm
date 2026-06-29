import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        

        if (n == 1) {
            if (m == 1) {
                result = 2;
            }
        }
        else if (m == 1) {
            result = n * 2;
        }
        else {
            for (int i = 0; i < n; i++) {
                int tempRow = arr[i][0];
                int countRow = 1;
                int maxRow = 1;
                for (int j = 1; j < n; j++) {
                    if (tempRow == arr[i][j]) {
                        countRow++;
                    }
                    else {
                        countRow = 1;
                    }
                    maxRow = Math.max(maxRow, countRow);
                    tempRow = arr[i][j];
                }
                if (m <= maxRow) {
                    result++;
                }

                int tempCol = arr[0][i];
                int countCol = 1;
                int maxCol = 1;
                for (int j = 1; j < n; j++) {
                    if (tempCol == arr[j][i]) {
                        countCol++;
                    }
                    else {
                        countCol = 1;
                    }
                    maxCol = Math.max(maxCol, countCol);
                    tempCol = arr[j][i];
                }

                if (m <= maxCol) {
                    result++;
                }

            }
        }
        System.out.print(result);
    }
}