
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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            sb.append("#").append(test_case).append(" ");
            if (a > b) sb.append(">");
            else if (a < b) sb.append("<");
            else if (a == b) sb.append("=");
            
            sb.append("\n");
			

		}
        System.out.println(sb.toString());                                       
	}
}