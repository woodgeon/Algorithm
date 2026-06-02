import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int index = 0;
        List<Integer> visited = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                if (str.charAt(0) == 'R') {
                    index++;
                }
                else {
                    index--;
                }
                visited.add(index);
            }
        }

        int index2 = 0;
        List<Integer> visited2 = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            String str = sc.next();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                if (str.charAt(0) == 'R') {
                    index2++;
                }
                else {
                    index2--;
                }
                visited2.add(index2);
            }
        }

        int result = -1;
        for (int i = 0; i < visited.size(); i++) {
            if (i != 0 && visited.get(i).equals(visited2.get(i))) {
                result = i + 1;
                break;
            }
        }
        System.out.print(result);
    }
}