import java.util.*;
class Solution {
    public int solution(int n, int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 != numbers[i]) {
                answer = i + 1;
                break;
            }
        }
        if (answer == 0) {
            answer = n;
        }
        return answer;
    }
}
