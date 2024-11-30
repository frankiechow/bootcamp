package week9.Big2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Player {
    String name;
    List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        // This is a placeholder for actual logic to choose which card to play
        return hand.remove(0);
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }
}
