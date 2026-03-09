
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
         	char c = str.charAt(i);
            int alphabet = c - 'A' + 1;
            sb.append(alphabet);
            if (i < length - 1) sb.append(" ");
        }
        System.out.println(sb.toString());
	}
}