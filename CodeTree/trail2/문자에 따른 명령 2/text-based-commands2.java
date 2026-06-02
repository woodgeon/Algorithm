import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        String str = sc.next();
        int nx = 0;
        int ny = 0;
        int dirNum = 3;
        for (int i = 0; i < str.length(); i++) {
            char cmd = str.charAt(i);
            if (cmd == 'L') dirNum = (dirNum - 1 + 4) % 4;
            else if (cmd == 'R') dirNum = (dirNum + 1) % 4;
            else {
                nx += dx[dirNum];
                ny += dy[dirNum];
            }
        }
        System.out.print(nx + " " + ny);
    }
}