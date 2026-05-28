import java.util.*;

class Body {
    int height, weight, index;

    public Body(int height, int weight, int index) {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Body[] bodys = new Body[n];
        for (int i = 0; i < n; i++) {
            int hei = sc.nextInt();
            int wei = sc.nextInt();

            bodys[i] = new Body(hei, wei, i + 1);
        }

        Arrays.sort(bodys, new Comparator<Body>() {
            @Override
            public int compare(Body a, Body b) {
                if (a.height == b.height) {
                    return b.weight - a.weight;
                }
                return a.height - b.height;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(bodys[i].height + " " + bodys[i].weight + " " + bodys[i].index);
        }
    }
}