import java.util.*;

public class Main {

    static List<Integer> path;
    static int k;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        // Please write your code here.

        path = new ArrayList<>();

        choose(1);
    }

    static void printAnswer() {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    static void choose(int current) {
        if (current == n + 1) {
            printAnswer();
            return;
        }

        for (int i = 1; i <= k; i++) {
            path.add(i);
            choose(current + 1);
            path.remove(path.size() - 1);
        }
    }
}