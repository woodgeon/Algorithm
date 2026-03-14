
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
         	char c = str.charAt(i);
            int num = c - '0';
            sum += num;
        }
        System.out.print(sum);
	}
}