import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		int add,sub,mul,div,rem;
		a = scanner.nextInt();
		if(a < 0) a = 1;
		b = scanner.nextInt();
		if(b > 10000) b = 1;
		
		add = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		rem = a % b;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
		scanner.close();
	}
}