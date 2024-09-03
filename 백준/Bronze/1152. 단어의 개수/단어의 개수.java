import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		int n = 0;
		
		while (st.hasMoreTokens()) {
			n++;
			String token = st.nextToken();
		}
		System.out.println(n);
	}

}