import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> cardsDeque1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardsDeque2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> cardsGoal = new ArrayDeque<>(Arrays.asList(goal));
        
        while (!cardsGoal.isEmpty()) {
            if (!cardsDeque1.isEmpty() && cardsDeque1.peekFirst().equals(cardsGoal.peekFirst())) {
                cardsDeque1.pollFirst();
                cardsGoal.pollFirst();
            }
            else if (!cardsDeque2.isEmpty() && cardsDeque2.peekFirst().equals(cardsGoal.peekFirst())) {
                cardsDeque2.pollFirst();
                cardsGoal.pollFirst();
            }
            else {
                break;
            }
        }
        
        return cardsGoal.isEmpty() ? "Yes" : "No";
    }
}