import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            if (i % 2 == 0) {
                int[] tempArr = list.stream().mapToInt(Integer::intValue).toArray();
                Arrays.sort(tempArr);
                System.out.print(tempArr[i / 2] + " ");
            }
        }
    }
}