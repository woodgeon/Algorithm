import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		int[] num = new int[T];
        int middle = (int) Math.round(T / 2.0);
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < T; i++)
		{
			num[i] = Integer.parseInt(st.nextToken());
		}
        Arrays.sort(num);
        System.out.println(num[middle - 1]);   
	}
}