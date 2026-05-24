import java.util.Scanner;
class Student {
    String code;
    char add;
    int time;

    public Student(String code, char add, int time){
        this.code = code;
        this.add = add;
        this.time = time;
    }
};
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();

        char add = sc.next().charAt(0);

        int time = sc.nextInt();
        // Please write your code here.

        Student s = new Student(code, add, time);
        System.out.println("secret code : " + s.code);
        System.out.println("meeting point : " + s.add);
        System.out.println("time : " + s.time);
    }
}