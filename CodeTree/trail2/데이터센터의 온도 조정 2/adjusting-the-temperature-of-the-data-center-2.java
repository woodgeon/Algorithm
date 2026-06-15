import java.util.*;

class Range {
    int min;
    int max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();

        Range[] rangeArr = new Range[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int tempMin = sc.nextInt();

            int tempMax = sc.nextInt();

            rangeArr[i] = new Range(tempMin, tempMax);
        }
        int sum = 0;
        for (int i = -1; i <= 1001; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                if (i < rangeArr[j].min) {
                    temp += c;
                }
                else if (i <= rangeArr[j].max) {
                    temp += g;
                }
                else {
                    temp += h;
                }
            }
            sum = Math.max(sum, temp);
        }
        System.out.print(sum);
    }
}