
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
            sb.append("#").append(test_case).append(" ");
            
			String str = br.readLine();
            int len = str.length();
            boolean flag = true;
            for (int i = 0; i < len / 2; i++) {
             	char a = str.charAt(i);
             	char b = str.charAt(len - i - 1);
                if (a != b) {
                 	flag = false;   
                    break;
                }
            }
            
            if (flag) {
                sb.append(1);
            }
            else {
             	sb.append(0);   
            }
            
            if (test_case < T) sb.append("\n");
		}
        System.out.print(sb.toString());
	}
}