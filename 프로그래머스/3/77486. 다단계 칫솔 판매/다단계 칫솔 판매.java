import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        // 가입자 - 추천인 을 저장할 HashMap
        HashMap<String, String> parent = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            parent.put(enroll[i], referral[i]);
        }

        HashMap<String, Integer> total = new HashMap<>();

        for (int i = 0; i < seller.length; i++) {
            String currentName = seller[i];
            int money = amount[i] * 100;

            while (money > 0 && !currentName.equals("-")) {
                total.put(currentName, total.getOrDefault(currentName, 0) + money - (money / 10));
                // 10%를 추천인에게 넘겨주기 위하여 currentName을 수정. 가입자 - 추천인 Map을 통해 currentName으로 value를 찾아옴.
                currentName = parent.get(currentName);
                money = money / 10;
            }
        }
        
        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            // enroll의 i번째 해당하는 key값을 바탕으로 value를 찾아와라. 만약 없다면 그냥 0을 return.
            answer[i] = total.getOrDefault(enroll[i], 0);
        }
        
        return answer;
    }
}