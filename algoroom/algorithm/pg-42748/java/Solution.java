import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] tempArr = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = 0; j < tempArr.length; j++) {
                tempArr[j] = array[j + commands[i][0] - 1];
            }

            Arrays.sort(tempArr);
            answer[i] = tempArr[commands[i][2] - 1];
        }
        return answer;
    }
}
