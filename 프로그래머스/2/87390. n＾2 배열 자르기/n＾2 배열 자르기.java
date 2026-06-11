class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left) + 1;
        int[] answer = new int[len];
        
        for (int i = 0; i <= right - left; i++) {
            long q = (left + i) / n;
            long r = (left + i) % n;

            answer[i] = (int)(Math.max(q, r) + 1);
        }
        
        return answer;
    }
}