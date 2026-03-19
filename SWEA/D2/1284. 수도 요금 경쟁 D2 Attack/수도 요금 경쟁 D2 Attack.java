
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("#").append(test_case).append(" ");
            
            // A사의 리터당 기본 요금
            int P = Integer.parseInt(st.nextToken());
            // B사의 R이하 기본요금
            int Q = Integer.parseInt(st.nextToken());
            // B사의 R값(기준)
            int R = Integer.parseInt(st.nextToken());
            // B사의 기준 리터가 넘어갔을 때 추가 리터당 수도 요금
            int S = Integer.parseInt(st.nextToken());
            // 종민이가 쓰는 한달 수도의 양
            int W = Integer.parseInt(st.nextToken());
            
            int aCharges = P * W;
            int bCharges = 0;
            if (W > R) {
                bCharges = Q + (W - R) * S;
            }
            else {
             	bCharges = Q;   
            }
            
            sb.append(aCharges < bCharges ? aCharges : bCharges);
            if (test_case < T) sb.append("\n");
            
		}
        System.out.print(sb.toString());
	}
}