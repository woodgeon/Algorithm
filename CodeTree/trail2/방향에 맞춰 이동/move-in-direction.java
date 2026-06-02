import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        int nx = 0;
        int ny = 0;

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.

            int dirNum = 0;

            if (direction == 'E') dirNum = 0;
            else if (direction == 'S') dirNum = 1;
            else if (direction == 'W') dirNum = 2;
            else if (direction == 'N') dirNum = 3;

            nx += dx[dirNum] * distance;
            ny += dy[dirNum] * distance;
        }
        System.out.print(nx + " " + ny);
    }
}