
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{	
            sb.append("#").append(test_case).append(" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
            int startMonth = Integer.parseInt(st.nextToken());
            int startDay = Integer.parseInt(st.nextToken());
            
            int endMonth = Integer.parseInt(st.nextToken());
            int endDay = Integer.parseInt(st.nextToken());
            
            if (startMonth == endMonth) {
             	sb.append(endDay - startDay + 1);
                if (test_case < T) sb.append("\n");
                continue;
            }
            else {
                int sum = 0;
                for (int i = startMonth; i <= endMonth; i++) {
                    if (i == startMonth) {
                        sum += month[i - 1] - startDay + 1;
                    }
                    else if (i == endMonth) {
                        sum += endDay;
                    }
                    else {
                        sum += month[i - 1];
                    }
                    
                }
                sb.append(sum);
                if (test_case < T) sb.append("\n");
            }
		}
        System.out.print(sb.toString());
	}
}