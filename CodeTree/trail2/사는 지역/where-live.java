import java.util.*;

class Person {
    String name;
    String zipCode;
    String region;

    public Person(String name, String zipCode, String region) {
        this.name = name;
        this.zipCode = zipCode;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] personList = new Person[n];
        String[] nameList = new String[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String zipCode = sc.next();
            String region = sc.next();

            personList[i] = new Person(name, zipCode, region);
            nameList[i] = name;
        }

        Arrays.sort(nameList);
        String last = nameList[n - 1];
        for (int i = 0; i < n; i++) {
            if (personList[i].name.equals(last)) {
                System.out.println("name " + personList[i].name);
                System.out.println("addr " + personList[i].zipCode);
                System.out.println("city " + personList[i].region);
            }
        }
    }
}