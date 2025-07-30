import java.util.HashMap;
import java.util.ArrayDeque;

class Solution {
    public int solution(String s) {
        
        HashMap<Character, Character> map = new HashMap<>();
        
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        int n = s.length();
        s += s;
        int answer = 0;
        
        A:for (int i = 0; i < n; i++) {
            
            ArrayDeque<Character> stack = new ArrayDeque<>();
            
            for (int j = i; j < i + n; j++) {
                
                char c = s.charAt(j);
                // 해시맵 안에 해당 키가 없다면 (열린 괄호가 들어왔을 때)
                if (!map.containsKey(c)) {
                    stack.push(c);
                }
                else {
                    // 닫힌 괄호가 들어왔을 때 스택의 최상단에서(열린 괄호) 꺼낸 게 짝이 맞지 않으면 내부 for문 종료
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c)))
                        continue A;
                }
            }
            if (stack.isEmpty())
                    answer++;
        }
        
        return answer;
    }
}