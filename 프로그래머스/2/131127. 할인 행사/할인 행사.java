import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        // want + number 를 하나의 값으로 묶는 HashMap 자료구조 사용
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        int answer = 0;

        for (int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> discount10d = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                if (wantMap.containsKey(discount[j])) {
                    discount10d.put(discount[j], discount10d.getOrDefault(discount[j], 0) + 1);
                }
            }
            
            if (discount10d.equals(wantMap)) {
                answer++;
            }
        }
        
        return answer;
    }
}