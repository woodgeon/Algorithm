
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
			int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++) {
                	arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            StringBuilder sb = new StringBuilder();
            // 90
            for (int i = 0 ; i < n; i++) {
                for (int j = n - 1; j >= 0; j--) {
                	    sb.append(arr[j][i]);
                }
                sb.append(" ");
            }
            // 180
            for (int i = n - 1 ; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                	    sb.append(arr[i][j]);
                }
                sb.append(" ");
            }
            // 270
            for (int i = n - 1 ; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                	    sb.append(arr[j][i]);
                }
                if (i > 0) sb.append(" ");
            }
            
            String str = sb.toString();
            StringTokenizer st = new StringTokenizer(str);
            String[][] returnArr = new String[n][3];
            
            for (int i = 0; i < 3; i++) {
            	for (int j = 0; j < n; j++) {
                	    returnArr[j][i] = st.nextToken();
                }
            }
            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
            	for (int j = 0; j < 3; j++) {
                	System.out.print(returnArr[i][j] + " ");
                }
                System.out.print("\n");
            }
		}
	}
}