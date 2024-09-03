import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int mul = a*b*c;

		int n[] = new int[10];
		String mulStr = String.valueOf(mul);
		
		for(int i = 0; i < mulStr.length(); i++) {
			char ch = mulStr.charAt(i);
            int digit = Character.getNumericValue(ch);
            n[digit]++;
		}
		for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

	}

}