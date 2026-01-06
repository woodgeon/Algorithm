//  ISBN

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String isbn = br.readLine();
        int iNum = 0;
        for (int i = 0; i < isbn.length(); i++) {
            if (isbn.charAt(i) == '*') {
                continue;
            }
            if (i % 2 == 1) {
                iNum += (isbn.charAt(i) - '0') * 3;
            }
            else {
                iNum += isbn.charAt(i) - '0';
            }
        }

        if (iNum % 10 == 0) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < isbn.length(); i++) {
            if (isbn.charAt(i) == '*') {
                if (i % 2 == 1) {
                    for (int j = 0; j < 10; j++) {
                        if ((iNum + j * 3) % 10 == 0) {
                            System.out.println(j);
                            return;
                        }
                    }
                }
                else {
                    for (int j = 0; j < 10; j++) {
                        if ((iNum + j) % 10 == 0) {
                            System.out.println(j);
                            return;
                        }
                    }
                }
            }
        }
        
        return;

    }
}