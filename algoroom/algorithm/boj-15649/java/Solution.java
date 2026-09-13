import java.util.*;
class Solution {

    static List<Integer> path = new ArrayList<>();
    static List<int[]> answer = new ArrayList<>();
    static boolean[] visited;

    static int N;
    static int M;
    public int[][] solution(int n, int m) {
        N = n;
        M = m;
        visited = new boolean[n + 1];
        
        choose();
        
        return answer.toArray(new int[0][]);
    }

    public void choose() {
        if (path.size() == M) {
            int[] temp = new int[M];
            for (int i = 0; i < path.size(); i++) {
                temp[i] = path.get(i);
            }
            answer.add(temp);
            return;
        }

        for (int i = 1; i <= N; i++) {
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
}
