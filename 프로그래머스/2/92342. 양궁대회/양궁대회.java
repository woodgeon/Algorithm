class Solution {
    private static int max;
    private static int[] answer;
    private static int[] apeach;

    // 1. 주어진 조합에서 각각의 점수 계산
    private static int getScore(int[] ryan) {
        int score = 0;

        for (int i = 0; i <= 10; i++) {
            if (ryan[i] + apeach[i] > 0) {
                score += ryan[i] > apeach[i] ? (10 - i) : -(10 - i);
            }
        }

        return score;
    }

    // 2. 최대 차이와 라이언의 과녁 저장
    private static void calculateDiff(int[] ryan) {
        int score = getScore(ryan);
        if (max < score) {
            max = score;
            answer = ryan.clone(); // 참조 복사 방지
        }
        // 2-1. 점수가 같으면 가장 낮은 점수를 더 맞힌 경우를 찾음
        else if (max > 0 && max == score) {
            for (int i = 10; i >= 0; i--) {
                if (answer[i] != ryan[i]) {
                    if (answer[i] < ryan[i]) {
                        answer = ryan.clone();
                    }
                    break;
                }
            }
        }
    }

    // 3. 가능한 라이언의 과녁 점수 조합의 모든 경우를 구함
    private static void backtrack(int n, int idx, int[] ryan) {
        if (n == 0) {
            calculateDiff(ryan);
            return;
        }

        for (int i = idx; i <= 10; i++) {
            int cnt = Math.min(n, apeach[i] + 1);
            ryan[i] = cnt;
            backtrack(n - cnt, i + 1, ryan);
            ryan[i] = 0;
        }
    }

    // 4. 최대 차이가 0인 경우 -1, 그렇지 않으면 answer 반환
    public static int[] solution(int n, int[] info) {
        apeach = info;
        max = 0;
        backtrack(n, 0, new int[11]);
        return max == 0 ? new int[]{-1} : answer;
    }
}