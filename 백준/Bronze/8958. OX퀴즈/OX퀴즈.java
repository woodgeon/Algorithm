import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			String str = sc.next();
			int sum = 0;
			int plus = 1;
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if(ch == 'O') sum = sum + plus++;
				else if(ch == 'X') {
					plus = 1;
				}
			}
			System.out.println(sum);
			
		}
		sc.close();

	}

}
