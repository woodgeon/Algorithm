import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<>();
        
        char prevWord = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i]) || prevWord != words[i].charAt(0)) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            set.add(words[i]);
            // 이전 단어의 마지막 글자
            prevWord = words[i].charAt(words[i].length() - 1);
        }
        
        return new int[]{0, 0};
    }
}