
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
		
			int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
            }
            
            Arrays.sort(arr);
            sb.append("#").append(test_case).append(" ");
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]);
                if (i < N - 1) sb.append(" ");
            }
            
            if (test_case < T) sb.append("\n");

		}
        System.out.print(sb.toString());
	}
}