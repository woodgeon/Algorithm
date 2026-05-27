import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, kor, eng, math);
        }

        // custom comparator를 활용한 정렬
        Arrays.sort(students, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) { 
                return (a.kor + a.eng + a.math) - (b.kor + b.eng + b.math);
            }
        });

        // 결과를 출력합니다.
        for (int i = 0; i < n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].kor + " ");
            System.out.print(students[i].eng + " ");
            System.out.println(students[i].math);
        }
    }
}

