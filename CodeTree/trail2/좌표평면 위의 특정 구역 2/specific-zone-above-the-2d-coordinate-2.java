import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int area = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;

            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                // 이번 반복에서 제외한 점의 index
                if (j == i) {
                    continue;
                }
                // 이번 반복에서 제외한 점을 뺀 최대 X값 (넓이 구하기에 사용)
                maxX = Math.max(maxX, x[j]);
                minX = Math.min(minX, x[j]);
                // 이번 반복에서 제외한 점을 뺀 최대 Y값 (넓이 구하기에 사용)
                maxY = Math.max(maxY, y[j]);
                minY = Math.min(minY, y[j]);
            }

            int tempArea = (maxX - minX) * (maxY - minY);
            area = Math.min(area, tempArea);
        }
        System.out.print(area);
    }
}