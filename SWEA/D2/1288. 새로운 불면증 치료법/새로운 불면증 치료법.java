
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
		
			int N = Integer.parseInt(br.readLine());
            Set<Character> set = new HashSet<>();
            sb.append("#").append(test_case).append(" ");
            
            int k = 0;
            while (true) {
                k++;
                int temp = k * N;
                String str = String.valueOf(temp);
                for (int i = 0; i < str.length(); i++) {
                 	char c = str.charAt(i);
                    set.add(c);
                }
                
                if (set.size() == 10) {
                 	sb.append(k * N);
                    break;
                }
            }
            
            if (test_case < T) sb.append("\n");
		}
        System.out.print(sb.toString());
	}
}