import java.util.*;

class Temp {
    int value;
    public Temp(int value) {
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temp t1 = new Temp(sc.nextInt());
        Temp t2 = new Temp(sc.nextInt());

        if (t1.value > t2.value) {
            t1.value += 25;
            t2.value *= 2;
        }
        else {
            t2.value += 25;
            t1.value *= 2;
        }
        System.out.print(t1.value + " " + t2.value);
        
    }
    static void swapt(Temp t1, Temp t2) {
        int temp = t1.value;
        t1.value = t2.value;
        t2.value = temp;
    }
}