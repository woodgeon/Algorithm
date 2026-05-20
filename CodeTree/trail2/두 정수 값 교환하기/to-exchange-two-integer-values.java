import java.util.*;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        IntWrapper a = new IntWrapper(a1);
        int b1 = sc.nextInt();
        IntWrapper b = new IntWrapper(b1);
        swap(a, b);

        System.out.print(a.value + " " + b.value);  
    }
    static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}