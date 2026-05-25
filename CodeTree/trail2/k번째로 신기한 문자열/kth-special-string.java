import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<String>();
        int k = sc.nextInt();
        String t = sc.next();

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            String str = sc.next();
            if (str.length() < t.length()) continue;
            for (int j = 0; j < t.length(); j++) {
                if (str.charAt(j) != t.charAt(j)) {
                    flag = false;
                }
            }
            if (flag) list.add(str);
        }
        String[] strArray = list.toArray(new String[list.size()]);

        Arrays.sort(strArray);
        System.out.print(strArray[k - 1]);
    }
}