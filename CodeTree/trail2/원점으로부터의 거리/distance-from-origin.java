import java.util.*;

class Point {
    int x, y;
    int index;

    public Point(int x, int y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] pList = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x < 0) {
                x = Math.abs(x);
            }
            if (y < 0) {
                y = Math.abs(y);
            }

            pList[i] = new Point(x, y, i + 1);
        }

        Arrays.sort(pList, new Comparator<Point>() {
            @Override
            public int compare(Point a, Point b) {
                if ((a.x + a.y) == (b.x + b.y)) {
                    return a.index - b.index;
                }
                return (a.x + a.y) - (b.x + b.y);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(pList[i].index);
        }

        
        
    }
}