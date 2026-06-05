import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
           return b.getValue().compareTo(a.getValue()); 
        });
        
        pq.addAll(map.entrySet());
        
        while(!pq.isEmpty()) {
            if (k <= 0) break;
            Map.Entry<Integer, Integer> entry = pq.poll();
            int n = entry.getValue();
            k = k - n;
            answer++;
        }
        
        return answer;
    }
}