
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
			sb.append("#").append(test_case).append(" ");
			StringBuilder sb2 = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
             	StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                char c = s.charAt(0);
                int count = Integer.parseInt(st.nextToken());
                
                while (count-- != 0) {
                 	sb2.append(c);   
                }
            }
            
            String str = sb2.toString();
            int len = str.length();
            for (int i = 0; i < len; i++) {
             	if (i % 10 == 0) sb.append("\n");
                
                char c = str.charAt(i);
                sb.append(c);
            }
			if (test_case < T) sb.append("\n"); 
		}
        System.out.print(sb.toString());
	}
}