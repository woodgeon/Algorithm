import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String splitter[] = str.split(" ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
        	a[i] = Integer.parseInt(splitter[i]);
        }
        int max, min = 0;
        max = a[0];
        for (int i = 1; i < n; i++) {
        	if(max < a[i])
        		max = a[i];
        }
        min = a[0];
        for (int i = 1; i < n; i++) {
        	if(min > a[i])
        		min = a[i];
        }
        System.out.println(min + " " + max);
        sc.close();
    }
}