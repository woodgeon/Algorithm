import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        boolean[][] check = new boolean[r][c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                char temp = sc.next().charAt(0);
                if (temp == 'W') {
                    check[i][j] = true;
                }
                else {
                    check[i][j] = false;
                }
            }
        }

        // 0, 0에서 시작. 
        boolean start = check[0][0];
        // 점프 횟수는 총 2번. 그니까 시작 -> 1점프, 2점프 -> 도착
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                
                if (start == check[i][j]) {
                    continue;
                }
                for (int k = i + 1; k < r - 1; k++) {
                    for (int l = j + 1; l < c - 1; l++) {
                        // 1. 첫 번째 중간 칸과 두 번째 중간 칸의 색이 다른지
                        // 2. 두 번째 중간 칸과 도착점의 색이 다른지
                        // 둘 다 만족하면 answer 증가
                        if (check[i][j] != check[k][l] && check[k][l] != check[r-1][c-1]) {
                            count++;
                        }

                    }
                }
            }
        }
        System.out.print(count);
    }
}