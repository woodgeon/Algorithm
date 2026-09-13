import java.util.*;

class Solution {

    static List<Integer> path = new ArrayList<>();
    static int[] array;
    static int count = 0;
    static int targetValue;
    
    public int solution(int[] numbers, int target) {
        array = numbers;
        targetValue = target;
        choose();
        
        return count;
    }

    public void choose() {
        // 종료 조건. 
        if (path.size() == array.length) {
            int sum = 0;
            // path에 있는 거 꺼내서 다 더하고
            for (int num : path) {
                sum += num;
            }
            // 그게 만약 target이랑 같다면 가능한 경우의 수니까 증가.
            if (sum == targetValue) {
                count++;
            }
            
            return;
        }
        int curIndex = path.size();
        
        path.add(array[curIndex]);
        choose();
        path.remove(path.size() - 1);

        path.add(-array[curIndex]);
        choose();
        path.remove(path.size() - 1);
    }
}
