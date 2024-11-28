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
    public void shuffle(){
        int half = this.cards.length / 2; // 52/2 =26
        Card[] newCards = new Card[this.cards.length];
        int idx = 0;
        for(int i = 0; i < this.cards.length / 2; i++){
            newCards[idx++] = this.cards[i]; // 0..1...25
            newCards[idx++] = this.cards[i + half]; // 26..27...51
        }
        this.cards = newCards;
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
       Card card = new Card('2', 'S');
       System.out.println(card);
    }
}
