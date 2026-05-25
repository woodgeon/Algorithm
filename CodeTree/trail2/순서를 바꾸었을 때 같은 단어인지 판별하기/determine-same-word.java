import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] str1Array = str1.toCharArray();
        Arrays.sort(str1Array);
        String sortedStr1 = new String(str1Array);

        char[] str2Array = str2.toCharArray();
        Arrays.sort(str2Array);
        String sortedStr2 = new String(str2Array);

        if (sortedStr1.equals(sortedStr2)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}