import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String cmd = sc.next();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int cx = 0;
        int cy = 0;
        int dirNum = 0;
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < cmd.length(); i++) {
            if (flag) {
                break;
            }
            char dir = cmd.charAt(i);
            dirNum = checkDir(dir, dirNum);
            if (dir == 'R' || dir == 'L') {
                count++;
                continue;
            }
            cx += dx[dirNum];
            cy += dy[dirNum];
            if (cx == 0 && cy == 0) {
                flag = true;
                break;
            }

            count++;
        }
        if (!flag) {
            System.out.print(-1);
        }
        else {
            System.out.print(count + 1);
        }
        
    }
    static int checkDir(char dir, int dirNum) {
        if (dir == 'R') return dirNum = (dirNum + 1) % 4;
        else if (dir == 'L') return dirNum = (dirNum - 1 + 4) % 4;
        else return dirNum;
    }
}