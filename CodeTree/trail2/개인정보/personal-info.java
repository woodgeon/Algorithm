import java.util.*;

class Student {
    String name;
    int cm;
    double kg;

    public Student(String name, int cm, double kg){
        this.name = name;
        this.cm = cm;
        this.kg = kg;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        String[] nameArr = new String[5];
        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            int cm = sc.nextInt();
            double kg = sc.nextDouble();

            students[i] = new Student(name, cm, kg);
            nameArr[i] = name;
        }

        Arrays.sort(nameArr);
        System.out.println("name");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                if (nameArr[i] == students[j].name) {
                    System.out.print(students[j].name + " ");
                    System.out.print(students[j].cm + " ");
                    System.out.printf("%.1f", students[j].kg);
                    System.out.println();
                    break;
                }
            }
        }


        Arrays.sort(students, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) { 
                return b.cm - a.cm;
            }
        });
        System.out.println();
        System.out.println("height");
        for (int i = 0; i < 5; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].cm + " ");
            System.out.printf("%.1f", students[i].kg);
            System.out.println();
        }
    }
}

