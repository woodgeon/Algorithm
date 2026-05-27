import java.util.*;

class Student {
    int cm, kg, index;

    public Student(int cm, int kg, int index){
        this.cm = cm;
        this.kg = kg;
        this.index = index;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            int cm = sc.nextInt();
            int kg = sc.nextInt();

            students[i] = new Student(cm, kg, i + 1);
        }

        // custom comparator를 활용한 정렬
        Arrays.sort(students, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) { 
                if (a.cm == b.cm) {
                    if (a.kg == b.kg) {
                        return a.index - b.index;
                    }
                    return b.kg - a.kg;
                }
                return b.cm - a.cm;
            }
        });

        // 결과를 출력합니다.
        for (int i = 0; i < n; i++){
            System.out.print(students[i].cm + " ");
            System.out.print(students[i].kg + " ");
            System.out.println(students[i].index);
        }
    }
}

