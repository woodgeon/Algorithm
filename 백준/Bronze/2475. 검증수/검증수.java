import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String splitter[] = str.split(" ");
        int n[] = new int[splitter.length];
        int sum = 0;
        for(int i = 0; i < splitter.length; i++) {
            n[i] = Integer.parseInt(splitter[i]);
            sum += (n[i] * n[i]);
        }
        System.out.println(sum % 10);
    }
}
