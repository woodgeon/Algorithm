
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] num = {2, 3, 5, 7, 11};
        int len = num.length; 
        StringBuilder sb = new StringBuilder();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.parseInt(br.readLine());
            sb.append("#").append(test_case).append(" ");
            for (int i = 0; i < len; i++) {
             	int count = 0;
                while (true) {
                 	if (N % num[i] != 0) break;
                    N /= num[i];
                    count++;
                }
                sb.append(count);
                if (i < len - 1) sb.append(" ");
            }
			
            if (test_case < T) sb.append("\n");
		}
        System.out.print(sb.toString());
	}
}