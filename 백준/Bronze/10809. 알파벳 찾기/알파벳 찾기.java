import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 1. 입력으로 들어온 단어를 charAt(i) 형태로 하나씩 꺼내온다.
        // 2. 알파벳 갯수 만큼의 길이를 가진 배열에 담는다.
        //    이때, 알파벳의 값 = 배열의 인덱스이고, 해당 인덱스에 저장되는 값은 단어 상의 인덱스이다.

        /**
         * 내가 생각한 해결 과정
         * 1. 입력으로 들어온 S의 길이만큼 반복문을 돈다
         * 2. 돌면서, 알파벳 갯수 배열에 담는다. 다만, 시작 시 배열은 모두 -1로 초기화 하고 진행한다.
         * 3. 반복문 탈출 후 배열을 정수 형태로 변환하여 반환한다.
         */


        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (alphabet[s.charAt(i) - 'a'] == -1) {
                alphabet[s.charAt(i) - 'a'] = i;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }

    }
}