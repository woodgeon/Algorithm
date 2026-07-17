import java.util.*;

public class Main {
    
    static List<Integer> path = new ArrayList<>();

    static int[] arr;

    static int n;
    static int m;
    static int max = 0;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        choose(0);

        System.out.print(max);

    }

    static void choose(int start) {
        if (path.size() == m) {
            int temp = path.get(0);
            for (int i = 1; i < path.size(); i++) {
                temp = temp ^ path.get(i);
            }
            max = Math.max(max, temp);
            return;
        }

        for (int i = start; i < n; i++) {
            path.add(arr[i]);
            choose(i + 1);
            path.remove(path.size() - 1);
        }
    }
}