import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append(" ");
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int i = 0; i < 10; i++) {
				int number = Integer.parseInt(st.nextToken());
                if (number % 2 == 1) sum += number;
            }
            sb.append(sum);
            System.out.println(sb.toString());
		}
	}
}