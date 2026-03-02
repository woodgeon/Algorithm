
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
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
			int[][] puzzle = new int[N][N];
            
            
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
             	for (int j = 0; j < N; j++) {
					puzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int count = 0;
            
            for (int i = 0; i < N; i++) {
                int run = 0;
                for (int j = 0; j < N; j++) {
                	if (puzzle[i][j] == 1) run++;
                    else {
                        if (run == K) count++;
                        run = 0;
                    }
                }
                if (run == K) count++;
            }
            
            for (int i = 0; i < N; i++) {
                int run = 0;
                for (int j = 0; j < N; j++) {
                	if (puzzle[j][i] == 1) run++;
                    else {
                        if (run == K) count++;
                        run = 0;
                    }
                }
                if (run == K) count++;
            }
            
            sb.append("#").append(test_case).append(" ").append(count).append("\n");
		}
        System.out.println(sb.toString());
	}
}