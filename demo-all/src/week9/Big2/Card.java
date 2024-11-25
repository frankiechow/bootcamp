package week9.Big2;
import java.util.Objects;
public class Card {
    private char rank;
    private char suit;

    public static final char[] SUITS = {'H', 'D', 'C', 'S'};
    public static final char[] RANKS = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};

    public Card(char rank, char suit){
        this.rank = rank;
        this.suit = suit;
    }
    public char getRank(){
        return this.rank;
    }
    public char getSuit(){
        return this.suit;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
        return true;
        if(!(obj instanceof Card))
        return false;
        Card card = (Card) obj;
        return Objects.equals(card.getRank(), this.rank) //
        && Objects.equals(card.getSuit(), this.suit);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.rank, this.suit);
    }

    @Override
    public String toString(){
        return " [Card-" //
        + "rank: " + this.rank + " "//
        + "suit: " + this.suit + "]";
    }
}
