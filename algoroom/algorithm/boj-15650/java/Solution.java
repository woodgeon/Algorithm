import java.util.*;

class Solution {

    static List<Integer> path = new ArrayList<>();
    static List<int[]> answer = new ArrayList<>();

    static int N;
    static int M;
    
    public int[][] solution(int n, int m) {
        N = n;
        M = m;

        choose(1);
        
        return answer.toArray(new int[0][]);
    }

    public void choose(int start) {
        if (path.size() == M) {
            int[] temp = new int[M];
            for (int i = 0; i < M; i++) {
                temp[i] = path.get(i);
            }
            answer.add(temp);
            return;
        }

        for (int i = start; i <= N; i++) {
            path.add(i);
            choose(i + 1);
            path.remove(path.size() - 1);
        }
    }
}
