import java.util.*;

public class Main {

    static List<Integer> path = new ArrayList<>();
    static List<int[]> permutations = new ArrayList<>();

    static boolean[] visited;
    
    static int n;


    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n + 1];

        choose();

        for (int i = permutations.size() - 1; i >= 0; i--) {
            int[] temp = permutations.get(i);
            
            for (int j = 0; j < n; j++) {
                System.out.print(temp[j] + " ");
            }
            System.out.println();
        }

    }

    static void choose() {
        if (path.size() == n) {
            addPath();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            path.add(i);
            choose();

            path.remove(path.size() - 1);
            visited[i] = false;
        }
    }
    static void addPath() {
        int[] arr = new int[n];

        for (int i = 0; i < path.size(); i++) {
            arr[i] = path.get(i);
        }
        permutations.add(arr);
    }
}