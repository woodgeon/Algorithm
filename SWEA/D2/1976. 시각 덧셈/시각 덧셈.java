
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
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("#").append(test_case).append(" ");
			int aHour = Integer.parseInt(st.nextToken());
            int aMin = Integer.parseInt(st.nextToken());
            
            int bHour = Integer.parseInt(st.nextToken());
            int bMin = Integer.parseInt(st.nextToken());
            
            int sumHour = (aHour + bHour) % 12;
            int sumMin = 0;
            
            if (aMin + bMin > 60) {
                sumHour++;
                sumMin = aMin + bMin - 60;
            }
            else sumMin = aMin + bMin;
            
            
            
            sb.append(sumHour).append(" ").append(sumMin);
			
			if (test_case < T) sb.append("\n");
		}
        System.out.print(sb.toString());
	}
}