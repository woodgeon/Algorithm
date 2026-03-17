
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
            int[] arr = new int[10];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i++) {
            	int num = Integer.parseInt(st.nextToken());
                if (num > max) max = num;
                if (num < min) min = num;
                arr[i] = num;
            }
            
            int sum = 0;
            for (int num : arr) {
             	if (num == max) continue;
                else if (num == min) continue;
                
                sum += num;
            }
            int avg = (int) Math.round((double) sum / 8);
            sb.append("#").append(test_case).append(" ").append(avg);
            if (test_case < T) sb.append("\n");

		}
        System.out.print(sb.toString());
	}
}