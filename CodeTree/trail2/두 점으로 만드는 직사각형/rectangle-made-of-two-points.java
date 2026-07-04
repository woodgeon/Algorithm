import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];

        for (int i = 0; i < 4; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            arr2[i] = sc.nextInt();
        }
        int maxX = 0;
        int minX = 10;
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 1) {
                continue;
            }
            maxX = Math.max(arr1[i], maxX);
            maxX = Math.max(arr2[i], maxX);
            
            minX = Math.min(arr1[i], minX);
            minX = Math.min(arr2[i], minX);
        }

        int maxY = 0;
        int minY = 10;
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                continue;
            }
            maxY = Math.max(arr1[i], maxY);
            maxY = Math.max(arr2[i], maxY);

            minY = Math.min(arr1[i], minY);
            minY = Math.min(arr2[i], minY);
        }


        System.out.print((maxX - minX) * (maxY - minY));
    }
}