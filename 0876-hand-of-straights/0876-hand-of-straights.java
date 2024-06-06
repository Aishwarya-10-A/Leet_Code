import java.util.*;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> cardCount = new TreeMap<>();
        for (int card : hand) {
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }

        while (!cardCount.isEmpty()) {
            int firstCard = cardCount.firstKey();
            for (int i = 0; i < groupSize; i++) {
                int currentCard = firstCard + i;
                if (cardCount.getOrDefault(currentCard, 0) == 0) {
                    return false;
                }
                cardCount.put(currentCard, cardCount.get(currentCard) - 1);
                if (cardCount.get(currentCard) == 0) {
                    cardCount.remove(currentCard);
                }
            }
        }

        return true;
    }
}
