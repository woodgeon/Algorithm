import java.util.*;

public class Main {

    static List<Integer> path = new ArrayList<>();

    static int n;
    static int m;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        choose(1);
    }

    static void choose(int start) {
        if (path.size() == m) {
            printMixture();
            return;
        }

        for (int i = start; i <= n; i++) {
            path.add(i);
            choose(i + 1);
            path.remove(path.size() - 1);
        }
    }

    static void printMixture() {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
    
}