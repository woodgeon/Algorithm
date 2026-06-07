import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int cx = 0;
        int cy = 0;
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (flag) {
                break;
            }
            char dir = sc.next().charAt(0);
            int dirNum = checkDir(dir);
            int v = sc.nextInt();

            for (int j = 0; j < v; j++) {
                cx += dx[dirNum];
                cy += dy[dirNum];
                count++;
                if (cx == 0 && cy == 0) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            System.out.print(-1);
        }
        else {
            System.out.print(count);
        }
        
    }
    static int checkDir(char dir) {
        if (dir == 'N') return 0;
        else if (dir == 'E') return 1;
        else if (dir == 'S') return 2;
        else return 3;
    }
}