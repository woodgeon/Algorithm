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
            StringBuilder sb = new StringBuilder();
			int num = Integer.parseInt(br.readLine());
            sb.append("#" + num).append(" ");
            int[] cnt = new int[101];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                cnt[score]++;
            }
            
            int maxFreq = cnt[0];
            for (int i = 0; i < cnt.length; i++) {
            	if (cnt[i] > maxFreq) {
                	maxFreq = cnt[i];    
                }
            }
            
			ArrayList<Integer> list = new ArrayList<>();
        	for (int i = 0; i < cnt.length; i++) {
            	if (cnt[i] == maxFreq) {
                	list.add(i);
            	}
        	}
            Collections.sort(list, Collections.reverseOrder());
            sb.append(list.get(0));
            
            System.out.println(sb.toString());
		}
	}
}