import java.util.Scanner;

public class Main {
	public static void main(String [] agrs) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int sum = a+b;
		System.out.print(sum);
		
	    scanner.close();
	}
}