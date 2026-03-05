
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
            String s = br.readLine();
            byte[] decoded = Base64.getDecoder().decode(s);
            String result = new String(decoded);
			
            sb.append("#").append(test_case).append(" ").append(result);
            System.out.println(sb.toString());

		}
	}
}