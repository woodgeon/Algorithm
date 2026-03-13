
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
       	int[] won = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int len = won.length;
        
        StringBuilder sb = new StringBuilder();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int amount = Integer.parseInt(br.readLine());
            sb.append("#").append(test_case).append("\n");
            for (int i = 0; i < len; i++) {
                int count = amount / won[i];
                sb.append(count);
                if (i < len - 1) sb.append(" ");
                amount %= won[i];
            }
            if (test_case < T) sb.append("\n");
		}
        System.out.print(sb.toString());
	}
}