
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
            
            for (int i = 0; i < N; i++) {
             	for (int j = 0; j <= i; j++) {
                 	if (j == 0 || j == i) {
                     	arr[i][j] = 1;   
                    }
                    else {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    }
                }
            }
            
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append("\n");
            for (int i = 0; i < N; i++) {
             	for (int j = 0; j < N; j++) {
                    if (arr[i][j] != 0) sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
		}
	}
}