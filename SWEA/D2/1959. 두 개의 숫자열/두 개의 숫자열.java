
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int[] Ai = new int[N];
            int[] Bj = new int[M];
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
               Ai[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
               Bj[i] = Integer.parseInt(st.nextToken());
            }
            
            
            // 1. Ai, Bj 중 누가 더 길이가 긴 배열인지 검사
            // 2. 긴 배열은 maxArr 작은 배열은 minArr로 복사
            int[] maxArr;
            int[] minArr;
            if (Ai.length > Bj.length) {
                maxArr = Ai.clone();
                minArr = Bj.clone();
            }
            else if (Bj.length > Ai.length) {
                maxArr = Bj.clone();
                minArr = Ai.clone();
            }
            else { // 두 배열의 길이가 서로 같다는 것
                maxArr = Ai.clone();
                minArr = Bj.clone();
            }
            
            // 3. maxArr.length - minArr을 하면 첫번째 반복문의 범위가 나옴. 첫번째 반복문의 범위는 사실 배열의 이동횟수나 다름 없음
            // 4. 두번째 반복문의 범위는 첫번째에서 지정한 i값에서 +minArr까지 간다음 각 배열의 인덱스 값들을 곱하고 더함. 
            //     이때 이중 반복문 안에서 우리가 최종적으로 구해야 할 maxReturn 값만 바꿔주면 됨.
            int range = maxArr.length - minArr.length;
            int maxNum = 0;
            for (int i = 0; i <= range; i++) {
                int temp = 0;
                for (int j = i, k = 0; j < i + minArr.length; j++, k++) {
                    temp += maxArr[j] * minArr[k];
                }
                if (temp > maxNum) maxNum = temp;
            }
            
            sb.append("#").append(test_case).append(" ").append(maxNum);
            
            if (test_case < T) sb.append("\n");

		}
        System.out.print(sb.toString());
	}
}