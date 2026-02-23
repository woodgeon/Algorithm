import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int count = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] building = new int[count];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count; i++) {
           		building[i] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;
           
            for (int i = 2; i < count - 2; i++) {
                int max = 0;
                for (int j = i - 1; j >= i - 2; j--) {
                    if (building[j] > max) {
                     	max = building[j];   
                    }
                }
                for (int k = i + 1; k <= i + 2; k++) {
                    if (building[k] > max) {
                     	max = building[k];   
                    }
                }
                if (building[i] > max) {
                 	sum += building[i] - max;   
                }                
            }
            sb.append("#").append(test_case).append(" ").append(sum);
            System.out.println(sb.toString());
		}
	}
}