import java.util.*;
/*
큐에 트럭 무게와 증가될 시간을 배열의 형태로 넣는다.
1초의 시간이 지날 때 다음과 같은 검사를 진행한다.현재 다리 위에 있는 트럭의 무게가 다음에 들어올 트럭의 무게와 같은지 검사한다.
건너고 있는 트럭이 다리 길이만큼 건넜다면 큐에서 뺀다.

중요한 건, 시간의 흐름이다.트럭이 빠지는지 검사하고
만약 빠졌다면 새 트럭을 넣고
시간을 증가시킨다.

큐가 비었다면 탈출하고 시간을 return 한다.
*/
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int seconds = 0;
        int index = 0;
        int curWeight = 0;

        Deque<int[]> deque = new ArrayDeque<>();
        
        
        while (index < truck_weights.length || !deque.isEmpty()) {

            // 1초 동안 트럭 이동
            goTruck(deque);

            // 다리를 다 건넌 트럭 제거
            if (!deque.isEmpty()
                    && deque.peekFirst()[1] == bridge_length) {

                int[] truck = deque.pollFirst();
                curWeight -= truck[0];
            }

            // 다음 트럭이 존재하고, 다리가 무게를 버틸 수 있다면 진입
            if (index < truck_weights.length
                    && curWeight + truck_weights[index] <= weight) {

                curWeight += truck_weights[index];
                deque.offerLast(new int[]{truck_weights[index], 0});
                index++;
            }

            seconds++;
        }

        return seconds;
    }

    static void goTruck(Deque<int[]> deque) {
        for (int[] truck : deque) {
            truck[1]++;
        }
    }
}