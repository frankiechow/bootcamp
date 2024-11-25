package week9.Big2;
public class Deck {
    private Card[] cards;

    public Deck(){
        this.cards = new Card[52];
        int idx = 0;
        for(char suit : Card.SUITS){
            for(char rank : Card.RANKS){
                this.cards[idx] = new Card(rank, suit);
                idx++;
            }
        }
    }
    public int size(){
        return this.cards.length;
    }

    
    @Override
    public String toString(){
        String value = "Deck";
        for(Card card : this.cards){
            value += card.toString();
        }
        value = value.substring(0, value.length() - 1); // return new string object
        return value;
    }

    

    public static void main(String[] args) {
       Deck deck = new Deck();
       System.out.println(deck);
       System.out.println(deck.size());
    }
}
