import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : num_list) 
            list.add(num);
        
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2])
            list.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        else
            list.add(num_list[num_list.length - 1] * 2);
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}