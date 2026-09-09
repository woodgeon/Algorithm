import java.util.*;

class Solution {
    public int solution(String dna) {
        int answer = 0;
        int count = 1;
        for (int i = 1; i < dna.length(); i++) {
            if (dna.charAt(i) == dna.charAt(i - 1)) {
                count++;
            }
            else {
                answer = Math.max(answer, count);
                count = 1;
            }
        }
        answer = Math.max(answer, count);
        return answer;
    }
}
