import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[9];
		for(int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if(n[i] >= 100)
				n[i] = 99;
		}
		int max = 0; 
		int mIndex = 0;
		for(int i = 0; i < n.length; i++) {
			if(max < n[i]) {
				max = n[i];
				mIndex = i + 1;
			}
			
		}
		System.out.println(max);
		System.out.println(mIndex);
		sc.close();
	}

}