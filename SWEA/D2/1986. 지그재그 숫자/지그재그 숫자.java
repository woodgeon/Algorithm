
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
			int N = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int i = 1; i <= N; i++) {
            	if (i % 2 == 0) sum -= i;
                else sum += i;
                
            }
            sb.append("#").append(test_case).append(" ").append(sum);
            if (test_case < T) sb.append("\n");
		}
        System.out.println(sb.toString());
	}
}