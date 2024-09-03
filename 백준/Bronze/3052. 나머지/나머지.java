import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10];
		int rM[] = new int[42];
		for(int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
			rM[(n[i] % 42)]++; 
		}
		int count = 0;
		for(int i = 0; i < rM.length; i++)
			if(rM[i] != 0) count++;
		
		System.out.println(count);

	}

}