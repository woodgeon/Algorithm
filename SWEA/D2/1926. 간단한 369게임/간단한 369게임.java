import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
        StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= T; i++)
		{
			String s = String.valueOf(i);
            
            int clap = 0;
            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
            	if (c == '3' || c == '6' || c == '9') {
                    clap++;
                }
            }
            
            if (clap > 0) {
                for (int k = 0; k < clap; k++) {
                 	sb.append("-");	   
                }
            }
            else {
             	   sb.append(s);
            }
            if (i < T) sb.append(" ");
		}
        
        System.out.println(sb.toString());
	}
}