import java.util.*;

class User {
    String name;
    int level;

    public User() {
        this.name = "codetree";
        this.level = 10;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int level = sc.nextInt();
        User user = new User();
        System.out.println("user " + user.name + " lv " + user.level);

        user.setName(name);
        user.setLevel(level);
        System.out.print("user " + user.name + " lv " + user.level);

    }
}