import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		if(H < 0 || H > 24) H = 0;
		if(M < 0 || M > 60) M = 0;
		int cM = M - 45;
		if(cM < 0) {
			H--;
			if(H < 0) H = 23;
			cM = 60 + cM;
		}
		System.out.println(H + " " + cM);

	}

}