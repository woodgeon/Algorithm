class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ab2 = String.valueOf(a * b * 2);
        if(Integer.parseInt(ab) > Integer.parseInt(ab2))
            return Integer.parseInt(ab);
        else 
            return Integer.parseInt(ab2);
    }
}