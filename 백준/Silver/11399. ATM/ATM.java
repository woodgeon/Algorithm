//  ATM

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] people = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(people);
        int sum = 0;
        int returnHour = 0;
        for (int i = 0; i < N; i++) {
            sum += people[i];
            returnHour += sum;
        }

        System.out.println(returnHour);
    }
}