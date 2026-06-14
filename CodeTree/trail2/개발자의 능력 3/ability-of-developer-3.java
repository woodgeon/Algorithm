import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    min = Math.min(min, getDiff(i, j, k, arr));
                }
            }
        }
        System.out.print(min);
    }
    public static int getDiff(int a, int b, int c, int[] arr) {
        int sum1 = arr[a] + arr[b] + arr[c];
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            // 전체합
            sum2 += arr[i];
        }
        // 전체합 - 부분합 = 남은 팀원들의 능력치
        sum2 -= sum1;
        // 주어진 팀원들의 능력치 - 남은 팀원들의 능력치 = 차의 최소를 구하기 위해
        return Math.abs(sum1 - sum2);
    }
}