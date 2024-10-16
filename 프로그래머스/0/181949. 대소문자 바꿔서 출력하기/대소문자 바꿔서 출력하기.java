import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String A = "";
        for(char x : a.toCharArray()) {
            if(x >= 65 && x <= 90) {
                A += (char)(x+32);
            }
            else if(x >= 91 && x <= 122) {
                A += (char)(x-32);
            }
        }
        System.out.println(A);
    }
}