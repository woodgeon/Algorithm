import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = 0;
        for (int i = 1; i <= 3; i++) {
            boolean[] rock = new boolean[4];
            rock[i] = true;
            int count = 0;
            for (int j = 0; j < n; j++) {
                /*
                2번째
                - rock[a[1]](3번이 true라면) -> 해당 안됨
                */
                // rock[a[0]](1번이 true라면)
                if (rock[a[j]]) {
                    // 그거 false로 하고
                    rock[a[j]] = false;
                    // b로 가라.
                    rock[b[j]] = true;
                }
                /*
                2번째
                - 또는 rock[b[1]](2번이 true라면) -> 해당 안됨
                */
                // 근데 b도 결국 a랑 교환하니까
                else if (rock[b[j]]) {
                    // 그거 false로 하고
                    rock[b[j]] = false;
                    // b로 가라.
                    rock[a[j]] = true;
                }
                if (rock[c[j]] == true) {
                    count++;

                }
            }
            max = Math.max(max, count);
        }
        System.out.print(max);
    }
}