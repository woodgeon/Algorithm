import java.util.*;

class Number {
    int num, index;

    public Number(int num, int index) {
        this.num = num;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] numbers = new Number[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numbers[i] = new Number(num, i + 1);
        }

        Arrays.sort(numbers, new Comparator<Number>() {
            @Override
            public int compare(Number a, Number b) {
                if (a.num == b.num) {
                    return a.index - b.index;
                }
                return a.num - b.num;
            }
        });

        int[] numIndex = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int originIndex = numbers[i].index; // (1,2) (1,7)
            int sortedIndex = i + 1;
            numIndex[originIndex] = sortedIndex;
        }
        for (int i = 1; i < n + 1; i++) {
            System.out.print(numIndex[i] + " ");
        }
    }
}