import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			int k = 0;
			boolean trig = true;
			String s1[] = new String[str.length()];
			String s2[] = new String[str.length()];
			if(str.equals("0")) break;
			
			if(str.length() % 2 == 1) {
				int mid = str.length() / 2;
				for(int i = 0; i < mid; i++) {
					char ch = str.charAt(i);
					s1[i] = Character.toString(ch);
				}
				for(int j = str.length() - 1; j > mid; j--) {
					char ch = str.charAt(j);
					s2[k] = Character.toString(ch);
					k++;
				}
				for(int l = 0; l < mid; l++) { 
					if(!s1[l].equals(s2[l])) trig = false;
				}
				if(trig == true) System.out.println("yes");
				else if(trig == false) System.out.println("no");
			}
			else if(str.length() % 2 == 0) {
				int mid = str.length() / 2;
				for(int i = 0; i < mid; i++) {
					char ch = str.charAt(i);
					s1[i] = Character.toString(ch);
				}
				for(int j = str.length() - 1; j >= mid; j--) {
					char ch = str.charAt(j);
					s2[k] = Character.toString(ch);
					k++;
				}
				for(int l = 0; l < mid; l++) { 
					if(!s1[l].equals(s2[l])) trig = false;
				}
				if(trig == true) System.out.println("yes");
				else if(trig == false) System.out.println("no");
			}
		}

	}

}