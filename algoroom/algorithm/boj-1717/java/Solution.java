import java.util.*;

class Solution {

    static int[] parent;
    
    public String[] solution(int n, int[][] operations) {
        parent = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        List<String> result = new ArrayList<>();

        for (int[] current : operations) {

            int command = current[0];
            int a = current[1];
            int b = current[2];

            if (command == 0) {
                union(a, b);
            }
            else {
                if (find(a) == find(b)) {
                    result.add("YES");
                }
                else {
                    result.add("NO");
                }
            }
        }
        
        return result.toArray(new String[0]);
    }

    static int find(int x) {

        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {

        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }
}
