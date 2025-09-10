import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 완주한 선수들의 이름을 저장
        for (String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 참가한 선수들의 이름을 키로하는 값을 1씩 감소
        for (String name : participant) {
            // 완주한 선수들의 value 값은 1인데, 만약 getOrderDefault 했을 때, 없다면 0으로 저장됨
            // 즉, 완주하지 못 한 선수만 남게됨.
            if (map.getOrDefault(name, 0) == 0) {
                return name;
            }
            map.put(name, map.get(name) - 1);
        }
        // 형식상
        return null;
    }
}