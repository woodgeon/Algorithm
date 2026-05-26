import java.util.*;

class User {
    String name;
    int grade;

    public User(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        User[] userList = new User[5];
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int grade = sc.nextInt();
            userList[i] = new User(name, grade);
        }

        int min = 100;
        String name = "";
        for (int i = 0; i < 5; i++) {
            if (userList[i].grade < min) {
                min = userList[i].grade;
                name = userList[i].name;
            }
        }
        System.out.print(name + " " + min);

    }
}