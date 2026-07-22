import java.util.*;

public class Main {
    /*
    k는 숫자들의 범위
    n은 몇 번 반복했는지 = 몇 번 뽑을지 정하는 수

    그러므로 1~k 사이의 수를 n번 뽑아서 나올 수 있는 조합 모두를 구하는 문제.
    */
    static List<Integer> path = new ArrayList<>();

    static int n;
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        choose();
    }

    static void choose() {
        if (path.size() == n) {
            printPath();
            return;
        }

        for (int i = 1; i <= k; i++) {
            path.add(i);
            choose();
            path.remove(path.size() - 1);
        }
    }

    static void printPath() {
        for (int num : path) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}