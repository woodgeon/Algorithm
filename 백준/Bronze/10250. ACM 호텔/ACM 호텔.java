import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int YY;
		    int XX;

		    if(N%H==0){
		        YY=H;
		        XX=N/H;
		    }
		    else{
		      YY=N%H;
		      XX=N/H+1;
		    }
			
		    System.out.println(100*YY+XX);
		}

	}

}
