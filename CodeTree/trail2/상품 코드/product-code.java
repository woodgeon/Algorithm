import java.util.*;

class Product {
    String name;
    int code;

    public Product() {
        this.name = "codetree";
        this.code = 50;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        String name = sc.next();
        int code = sc.nextInt();
        Product p1 = new Product(name, code);

        System.out.println("product " + p.code + " is "+ p.name);
        System.out.println("product " + p1.code + " is "+ p1.name);
    }
}