import java.util.*;

class Solution {
    private static HashMap<Integer, HashMap<String, Integer>> courseMap;

    public static String[] solution(String[] orders, int[] course) {
        /**
         * 해시맵 초기화.
         * 만들고자 하는 코스 요리의 메뉴 가짓수 + HashMap을 담은 HashMap 자료구조 초기화
         */
        courseMap = new HashMap<>();
        for (int i : course) {
            courseMap.put(i, new HashMap<>());
        }

        // 1. 코스를 배열로 만들고 오름차순 정렬해서 가능한 모든 메뉴 구성을 구함
        for (String order : orders) {
            char[] orderArray = order.toCharArray();
            Arrays.sort(orderArray);
            combinations(0, orderArray, "");
        }

        ArrayList<String> answer = new ArrayList<>();

        // 2. 모든 코스 후보에 대해서
        for (HashMap<String, Integer> count : courseMap.values()) {
            count.values()
                    .stream()
                    // 3. 가장 빈도수가 높은 코스를 찾고
                    .max(Comparator.comparingInt(Integer::intValue))
                    // 4. 코스에 대한 메뉴 수가 가능할 때만
                    .ifPresent(cnt -> count.entrySet()
                            .stream()
                            // 5. 최소 2명 이상의 손님으로부터 주문된 단품 메뉴 조합에 대해서만
                            .filter(entry -> cnt.equals(entry.getValue()) && cnt > 1)
                            // 6. 코스 메뉴만 answer 리스트에 추가
                            .forEach(entry -> answer.add(entry.getKey())));
        }
        // 7. 오름차순으로 정렬
        Collections.sort(answer);
        
        return answer.toArray(new String[0]);
    }

    // 만들 수 있는 모든 조합을 재귀함수를 이용해서 구현
    public static void combinations(int idx, char[] order, String result) {
        // 필요한 코스 메뉴의 수와 일치하는 것만 저장
        if (courseMap.containsKey(result.length())) {
            /**
             * result에 빈 문자열을 줬음. 처음엔 해당되지 않기 때문에 패스
             * 그 후 아래 for문에서 order.length 전까지 i가 증가
             * 증가된 i, character형 배열 order, 빈 문자열 + order의 i번째 값(char)을 가지고 재귀
             * 이때, result에 들어간 문자열의 길이가 역시나 courseMap에 없으면 반복.
             */
            HashMap<String, Integer> map = courseMap.get(result.length());
            map.put(result, map.getOrDefault(result, 0) + 1);
        }

        for (int i = idx; i < order.length; i++) {
            combinations(i + 1, order, result + order[i]);
        }
    }
}