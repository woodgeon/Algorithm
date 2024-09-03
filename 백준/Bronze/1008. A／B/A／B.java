import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b;
		double div;
		a = scanner.nextDouble();
		if(a < 0) a = 1;
		b = scanner.nextDouble();
		if(b > 10) b = 1;
		div = a / b;
			
		System.out.print(div);
		scanner.close();
	}
}