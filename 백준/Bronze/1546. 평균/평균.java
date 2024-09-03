import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double a[] = new double[n];
		
		for(int i = 0; i < n; i++) 
			a[i] = sc.nextInt();

		double max = a[0];
		double sum = 0;
		for(int i = 0; i < n; i++) {
			if(max < a[i]) max = a[i];
			sum += a[i];
	    }
		
			
		System.out.println(sum * 100.0 / max / n);
	}

}