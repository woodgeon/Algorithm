import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        char dir = sc.next().charAt(0);


        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};

        int cx = r - 1;
        int cy = c - 1;
        int dirNum = getDir(dir);

        for (int i = 0; i < t; i++) {
            int nx = cx + dx[dirNum];
            int ny = cy + dy[dirNum];
            if (!inRange(nx, ny, n)) {
                dirNum = 3 - dirNum;
                continue;
            }
            cx = nx;
            cy = ny;
        }
        System.out.print((cx + 1) + " " + (cy + 1));
    }
    public static int getDir(char dir) {
        if (dir == 'R') return 0;
        else if (dir == 'D') return 1;
        else if (dir == 'U') return 2;
        else return 3;
    }
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}