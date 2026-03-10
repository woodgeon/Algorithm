
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
      	String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
        StringBuilder sb = new StringBuilder();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            double K = Double.parseDouble(st.nextToken());
            
            Double[] student = new Double[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                double midtermExam = Double.parseDouble(st.nextToken());
                double finalExam = Double.parseDouble(st.nextToken());
                double task = Double.parseDouble(st.nextToken());
                
                double sum = midtermExam * 0.35 + finalExam * 0.45 + task * 0.2;
                if (i + 1 == K) K = sum;
                student[i] = sum;
            }
            
            Arrays.sort(student, Collections.reverseOrder());
            for (int i = 0; i < N; i++) {
             	if (student[i].equals(K)) {
                    // 여기서 K는 2가 나옴. 근데 2 / (N/10 = 1) 2가 나오니까.
                 	int rank = i / (N/10);
                    sb.append("#").append(test_case).append(" ").append(grade[rank]);
                    break;
                }
            }
			
			if (test_case < T) sb.append("\n");
		}
        System.out.println(sb.toString());
	}
}