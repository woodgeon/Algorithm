import java.util.*;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String result = "";
        if (!(str1 + str2).equals(str2 + str1)) return result;
        int gcd = gcdUclid(str1.length(), str2.length());
        result = str1.substring(0, gcd);
        return result;
    }
    int gcdUclid(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}