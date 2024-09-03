import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int isPN;
        int cnt=0;
        for(int i=0; i<num; i++){
            isPN = sc.nextInt();
            for(int p=2; p<=isPN; p++){
                if(p == isPN){
                    cnt++;
                }
                if(isPN % p == 0){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}