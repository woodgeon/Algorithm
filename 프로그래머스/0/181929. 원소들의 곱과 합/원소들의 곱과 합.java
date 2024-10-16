class Solution {
    public int solution(int[] num_list) {
        int sum = 1; // 곱셈을 위해 1로 초기화
        int sum2 = 0; // 합계를 위해 0으로 초기화

        for (int i = 0; i < num_list.length; i++) {
            sum *= num_list[i]; // 요소를 곱함
            sum2 += num_list[i]; // 요소를 더함
        }

        int sum3 = sum2 * sum2; // sum2의 제곱

        // sum이 sum3보다 작으면 1 반환, 크면 0 반환
        if (sum < sum3) {
            return 1; // sum이 sum3보다 작을 때
        } else {
            return 0; // sum이 sum3보다 크거나 같을 때
        }
    }
}
