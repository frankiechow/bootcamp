package week9.Big2;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// public class Deck {
//         private List<Card> cards;
    
//         public Deck() {
//             cards = new ArrayList<>();
//             for (Card.Suit s : Card.Suit.values()) {
//                 for (int rank = 3; rank <= 15; rank++) { // Big2 uses 3-2 in order, A=14, J=11, Q=12, K=13, 2=15
//                     cards.add(new Card(s, rank));
//                 }
//             }
//         }
    
//         public void shuffle() {
//             Collections.shuffle(cards);
//         }
    
//         public List<Card> dealCards(int numCards) {
//             List<Card> dealt = new ArrayList<>();
//             for (int i = 0; i < numCards && !cards.isEmpty(); i++) {
//                 dealt.add(cards.remove(0));
//             }
//             return dealt;
        
//     }
// }
