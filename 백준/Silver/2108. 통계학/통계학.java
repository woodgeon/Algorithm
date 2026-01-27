import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 산술평균 : N개의 수들의 합을 N으로 나눈 값
         * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
         * 최빈값 : N개의 수들 중 가장 많이 나타나는 값
         * 범위 : N개의 수들 중 최댓값과 최솟값의 차이
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int sum = 0; // 산술평균에 사용
        int[] nums = new int[t]; // 중앙값에 사용
        int[] cnt = new int[8001]; // 최빈값에 사용

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            sum += n; // 중앙값 산출을 위해 더하기

            nums[i] = n;

            cnt[n + 4000]++;
        }

        System.out.println(Math.round((double) sum / t));

        Arrays.sort(nums);
        System.out.println(nums[t / 2]);

        // 최빈값 로직
        int maxFreq = cnt[0];
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] > maxFreq) maxFreq = cnt[i];
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == maxFreq) {
                list.add(i - 4000);
            }
        }

        System.out.println(list.size() == 1 ? list.get(0) : list.get(1));

        // 범위값 로직
        System.out.println(nums[t - 1] - nums[0]);
    }
}