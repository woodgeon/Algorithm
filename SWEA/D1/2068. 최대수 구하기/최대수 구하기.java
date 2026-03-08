
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
            int max = 0;
            int i = 10;
            while (i-- > 0) {
             	int num = Integer.parseInt(st.nextToken());
            	if (num > max) max = num;
            }
            
            sb.append("#").append(test_case).append(" ").append(max).append("\n");
			

		}
        System.out.println(sb.toString());
	}
}