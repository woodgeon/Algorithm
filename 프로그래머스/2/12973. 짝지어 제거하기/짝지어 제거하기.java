import java.util.*;
class Solution
{
    public int solution(String s)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        // 스택이 비어있으면 1 return, 그렇지 않다면 0 반환
        return stack.isEmpty() ? 1 : 0;
    }
}