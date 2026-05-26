import java.util.*;

class Bomb {
    String code;
    String color;
    int time;

    public Bomb(String code, String color, int time) {
        this.code = code;
        this.color = color;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String color = sc.next();
        int time = sc.nextInt();
        Bomb b = new Bomb(code, color, time);
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + time);
    }
}