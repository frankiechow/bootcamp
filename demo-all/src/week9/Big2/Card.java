package week9.Big2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// ! For custom class, always override toString(), equals(), hashCode()
class Card implements Comparable<Card> {
    private int rank;
    private char suit;

    public Card(int rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() { return rank; }
    public char getSuit() { return suit; }

    @Override
    public int compareTo(Card other) {
        int rankComp = Integer.compare(this.rank, other.rank);
        return rankComp != 0 ? rankComp : Character.compare(this.suit, other.suit);
    }

    public static final char[] SUITS = {'S', 'H', 'C', 'D'}; // Spade, Heart, Club, Diamond
}