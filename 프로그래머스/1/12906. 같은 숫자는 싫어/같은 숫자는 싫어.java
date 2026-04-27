import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && arr[i] == stack.peek()) continue;
            stack.push(arr[i]);
        }
        
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        
        
        return result;
    }
}