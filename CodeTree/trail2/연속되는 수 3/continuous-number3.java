import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            // 부호가 바뀌지 않았다면 true.. 이전값과 현재값의 부호가 다르다면 어떠한 경우에도 들어가지 않기 때문에 false..
            boolean flag = i == 0 || (arr[i] > 0 && arr[i - 1] > 0) || (arr[i] < 0 && arr[i - 1] < 0);
            if (flag) {
                count++;
            }
            else {
                count = 1;
            }
            if (max < count) max = count;
        }
        if (max < count) max = count;
        System.out.print(max);
    }
}