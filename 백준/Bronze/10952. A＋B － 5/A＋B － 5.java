import java.util.Scanner;
public class Main {
	public static void main(String agrs[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a < 0) a = 1;
			if(b > 10) b = 9;
			
			if(a == 0 && b == 0) {
				sc.close();
				break;
			}
			System.out.println(a + b);
		}
	}
}