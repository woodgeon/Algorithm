import java.util.*;

public class Main {

    static List<Integer> path = new ArrayList<>();

    static int k;
    static int n;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        k = sc.nextInt();
        n = sc.nextInt();

        choose();
    }

    static void choose() {
        if (path.size() == n) {
            printAnswer();
            return;
        }

        for (int i = 1; i <= k; i++) {
            if (path.size() >= 2 && 
                path.get(path.size() - 2) == i &&
                path.get(path.size() - 1) == i) {
                continue;
            }

            path.add(i);
            choose();
            path.remove(path.size() - 1);
        }
    }

    static void printAnswer() {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
}