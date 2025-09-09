import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        // 각 열에 대한 스택 배열 생성
        ArrayDeque<Integer>[] lines = new ArrayDeque[board.length];
        for (int i = 0; i < lines.length; i++) {
            // 스택 배열을 생성한 후 각 배열의 인덱스마다 Stack 객체를 생성해야함. 하지 않으면 NullPointerException 발생
            lines[i] = new ArrayDeque<>();
        }

        // 1. 각 열에 대해 board에 들어온 값에 대해 초기화 진행. 이때, 2차원 배열의 마지막 행의 첫번째 원소부터 진행해야함.
        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    lines[j].push(board[i][j]);
                }
            }
        }

        // 2. 꺼내온 인형을 담을 Stack 구조의 bucket 생성
        ArrayDeque<Integer> bucket = new ArrayDeque<>();
        int answer = 0;

        // 3. moves 배열에 들어있는 값 = 인형을 꺼낼 스택 배열의 인덱스
        // 3-1. moves 배열의 원소는 1부터 시작하기 때문에 0번째 원소에 접근하려면 - 1 처리 해줘야함.
        // 3-2. 인형을 담는 bucket이 비어있지 않은지 검사하고, 맨 위의 인형과 같은 인형이라면 제거 처리 + answer에 처리한 인형 수 추가
        for (int move : moves) {
            if (!lines[move - 1].isEmpty()) {
                int doll = lines[move - 1].pop();
                
                if (!bucket.isEmpty() && bucket.peek() == doll) {
                    bucket.pop();
                    answer+=2;
                }
                else {
                    bucket.push(doll);
                }
            }
        }
        return answer;
    }
}