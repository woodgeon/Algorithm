import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int[] daysLeft = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int count = 0;
        int maxLeft = daysLeft[0];
        
        for (int i = 0; i < progresses.length; i++) {
            // 현재 들어온 배포일이 기준 배포일 보다 작거나 같을 경우 = 함께 배포되어야 하는 경우
            if (daysLeft[i] <= maxLeft) {
                count++;
            }
            // 비교되는 배포일이 기준 배포 일수보다 오래 걸리는 경우 = 쌓인 progress 배포하고 기준 배포일 재설정
            else {
                answer.add(count);
                count = 1;
                maxLeft = daysLeft[i];
            }
        }
        
        answer.add(count);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}