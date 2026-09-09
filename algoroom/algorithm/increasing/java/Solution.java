class Solution {
    public long solution(int[] numbers) {
        long answer = 0L;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                answer += (long) numbers[i - 1] - numbers[i];
                numbers[i] = numbers[i - 1];
            }
        }
        return answer;
    }
}
