import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        int len = clothes.length;
        for (int i = 0; i < len; i++) {
            String key = clothes[i][1];
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }
        
        int comb = 1;
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            comb *= (value + 1);
        }
        
        
        return comb - 1;
    }
}