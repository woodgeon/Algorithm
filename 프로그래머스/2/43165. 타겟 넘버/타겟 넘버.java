import java.util.*;

class Solution {
    
    static List<Integer> path = new ArrayList<>();
    static int[] arr;
    
    static int count;
    
    public int solution(int[] numbers, int target) {
        arr = numbers;
        
        choose(target);
        return count;
    }
    
    static void choose(int target) {
        if (path.size() == arr.length) {
            int sum = 0;
            
            for (int num : path) {
                sum += num;
            }
            
            if (sum == target) {
                count++;
            }
            
            return;
        }
        
        
        path.add(arr[path.size()]);
        choose(target);
        path.remove(path.size() - 1);
        
        path.add(-arr[path.size()]);
        choose(target);
        path.remove(path.size() - 1);
    }
}