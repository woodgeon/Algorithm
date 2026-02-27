import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		
        StringBuilder sb = new StringBuilder();
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String ymd = br.readLine();
            int year = Integer.parseInt(ymd.substring(0, 4));
            int month = Integer.parseInt(ymd.substring(4, 6));
            int day = Integer.parseInt(ymd.substring(6, 8));
            
            if (month < 1 || month > 12) {
				sb.append("#").append(test_case).append(" ").append("-1").append("\n");
                continue;
            }
            if (day < 1 || day > days[month]) {
            	sb.append("#").append(test_case).append(" ").append("-1").append("\n");
                continue;
            }
            sb.append("#").append(test_case).append(" ").append(ymd.substring(0, 4) + "/" + ymd.substring(4, 6) + "/" + ymd.substring(6, 8)).append("\n");
		}
        System.out.println(sb.toString());
	}
}