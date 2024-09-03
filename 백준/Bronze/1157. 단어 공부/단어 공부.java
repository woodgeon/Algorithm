import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int a[] = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
				a[str.charAt(i) - 'A']++;
			else
				a[str.charAt(i) - 'a']++;
		}
		
		int max = 0;
		char ch = '?';
		
		for(int i = 0; i < 26; i++) {
			if(max < a[i]) {
				max = a[i];
				ch = (char)(i + 'A');
			}
			else if(max == a[i])
				ch = '?';
		}
		System.out.println(ch);
	}

}
