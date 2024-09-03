import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, mul;
		a = scanner.nextInt();
		if(a < 0) a = 1;
		b = scanner.nextInt();
		if(b > 10) b = 1;
		mul = a * b;
			
		System.out.print(mul);
		scanner.close();
	}
}