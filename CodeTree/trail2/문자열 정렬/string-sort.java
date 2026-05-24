import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] temp = str.toCharArray();
        Arrays.sort(temp);

        String sortedStr = new String(temp);
        System.out.print(sortedStr);
    }
}