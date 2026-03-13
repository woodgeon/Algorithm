
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
			String str = br.readLine();
            
            sb.append("#").append(test_case).append(" ");
            for (int ren = 1 ; ren <= 10; ren++) {
                String pattern = str.substring(0, ren);
                boolean flag = true;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) != pattern.charAt(j % ren)) {
                     	flag = false;
                        break;
                    }
                }
                if (flag) {
                 	sb.append(ren);
                    break;
                }
            }
            
            if (test_case < T) sb.append("\n");
		}
        System.out.println(sb.toString());
	}
}