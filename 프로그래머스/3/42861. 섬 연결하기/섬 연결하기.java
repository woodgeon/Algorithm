import java.util.*;

class Solution {
    private static int[] parent;
    
    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        // 경로 압축 : 
        parent[x] = find(parent[x]);
        return parent[x];
    }
    
    public static void union(int x, int y) {
        int root1 = find(x);
        int root2 = find(y);
        
        parent[root2] = root1;
    }
    
    public static int solution(int n, int[][] costs) {
        // costs를 기준으로 다리의 비용을 오름차순으로 정렬
        Arrays.sort(costs, (o1, o2) -> Integer.compare(o1[2], o2[2]));
        
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        // 최소 신장 트리의 총 비용
        int answer = 0;
        // 연결된 다리의 수 (n - 1일 때 탈출하기 위함)
        int edges = 0;
        
        for (int[] edge : costs) {
            
            if (edges == n - 1) {
                break;
            }
            
            // 두 섬이 연결되어 있지 않다면 (루트노드가 같지 않을 때)
            if (find(edge[0]) != find(edge[1])) {
                // 두 섬 사이 다리를 건설하고 (union 연산)
                union(edge[0], edge[1]);
                // 비용을 추가한 뒤 (계속 더해줘야함.)
                answer += edge[2];
                // 다리를 지은 횟수를 추가한다.
                edges++;
            }
        }
        return answer;
    }
}