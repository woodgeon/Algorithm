import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j, k;
		for(i = 0; i < n; i++) {
			for(j = i; j < n - 1; j++) {
				System.out.print(" ");
			}
			for(k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}