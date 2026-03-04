
import java.util.*;
import java.io.*;


class Solution
{
    static boolean checkRow(int[][] arr) {
            for (int i = 0; i < 9; i++) {
                boolean[] seen = new boolean[10];
                for (int j = 0; j < 9; j++) {
                	int v = arr[i][j];
                    if (seen[v]) return false;
                    seen[v] = true;
                }
            }
            return true;
        }
    
    static boolean checkCol(int[][] arr) {
            for (int i = 0; i < 9; i++) {
                boolean[] seen = new boolean[10];
                for (int j = 0; j < 9; j++) {
                	int v = arr[j][i];
                    if (seen[v]) return false;
                    seen[v] = true;
                }
            }
            return true;
        }
    
    static boolean checkBox(int[][] arr) {
            for (int i = 0; i < 9; i+=3) { // y좌표로 0, 3 ,6
             	for (int j = 0; j < 9; j+=3) { // 내부에서 각 행마다 0, 3, 6번째 인덱스마다 진행 = Box 검사대상 선정 (0,0 / 0,3 / 0,6 등)
                    boolean[] seen = new boolean[10];
                 	for (int k = i; k < i + 3; k++) { // 이때 k는 i와 같아야함. 행마다 돌아야 하기 때문
                    	for (int n = j; n < j + 3; n++) { // 이때 n은 j와 같아야함. 각 행마다 원소 하나하나 검사해야하기 때문
                            /**
                            * 예를들어 (0,3)으로 여기까지 진입했을 때,
                            * k는 i와 같이 네번째 for문이 한번 끝날 때마다 1씩 증가함. 이때 k가 증가할 수 있는 범위는 i + 3이어야 하고, (0,3)으로 들어왔다는 가정 하에, 0 -> 1 -> 2 까지 증가할 것.
                            * n은 j와 같이 각 행마다 내부 원소를 검사하는 네번째 for문. (0,3)으로 들어왔으니 n이 증가할 수 있는 범위또한 j + 3. 즉, 3 -> 4 -> 5 까지 증가함. 
                            **/
                            int v = arr[k][n];
                            if (seen[v]) return false;
                            seen[v] = true;
                        }
                    }
                }
            }
            return true;
        }
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
      

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[][] arr = new int[9][9];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
             	StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            int answer = (checkRow(arr) && checkCol(arr) && checkBox(arr)) ? 1 : 0;
            sb.append("#").append(test_case).append(" ").append(answer);
            System.out.println(sb.toString());
		}
	}
}