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
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int[][] mosquito = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
            	for (int j = 0; j < N; j++) {
                	mosquito[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            int max = 0;
            for (int i = 0; i < N-M+1; i++) {
				for (int j = 0; j < N-M+1; j++) {
            		int sum = 0;
                	for (int k = i; k < i + M; k++) {
                    	for (int n = j; n < j + M; n++) {
                            sum += mosquito[k][n];
                        }
                    }
                    if (sum > max) max = sum;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append(" ").append(max);
            System.out.println(sb.toString());
		}
	}
}