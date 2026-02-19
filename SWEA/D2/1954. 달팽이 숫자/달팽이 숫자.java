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
			int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];
			
            // row : 행(세로)
            // column : 열(가로)
            int[] dr = {0, 1, 0, -1};
            int[] dc = {1, 0, -1, 0};
            
            int r = 0;
            int c = 0;
            int dir = 0;
            
            for(int i = 1; i <= N*N; i++) {
            	arr[r][c] = i;
                
                int nr = r + dr[dir];
                int nc = c + dc[dir];
                
                if (nr < 0 || nr >= N || nc < 0 || nc >= N || arr[nr][nc] != 0) {
                	dir = (dir + 1) % 4;
                    nr = r + dr[dir];
                    nc = c + dc[dir];
                }
                
                r = nr;
                c = nc;
            }
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
            	for (int j = 0; j < N; j++) {
                	System.out.print(arr[i][j] + " ");    
                }
                System.out.print("\n");
            }
		}
	}
}