import java.util.*;

class Student {
    String name;
    int cm;
    int kg;

    public Student(String name, int cm, int kg){
        this.name = name;
        this.cm = cm;
        this.kg = kg;
    }
};

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] studentList = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int cm = sc.nextInt();
            int kg = sc.nextInt();

            studentList[i] = new Student(name, cm, kg);
        }

        Arrays.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.cm == b.cm) {
                    return b.kg - a.kg;
                }
                return a.cm - b.cm;
            }
        });
        for (int i = 0; i < n; i++){
            System.out.print(studentList[i].name + " ");
            System.out.print(studentList[i].cm + " ");
            System.out.println(studentList[i].kg);
        }
    }
}