import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            boolean flag = false;
            int curCandy = candies[i] + extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if (curCandy < candies[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                result.add(false);
            }
            else {
                result.add(true);
            }
        }

        return result;
    }
}