package week9.Big2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Big2 {

    List<Player> players;
    Queue<Player> turnOrder;
    List<Card> currentPlay;

    public Big2(String... playerNames) {
        this.players = new ArrayList<>();
        this.turnOrder = new LinkedList<>();
        for (String name : playerNames) {
            players.add(new Player(name));
        }
        currentPlay = new ArrayList<>();
    }

    private void dealCards() {
        List<Card> deck = new ArrayList<>();
        for (int rank = 3; rank <= 15; rank++) { // 3 to Ace, with 15 representing 2 (highest)
            for (char suit : Card.SUITS) {
                deck.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(deck);

        for (Player player : players) {
            for (int i = 0; i < 13; i++) {
                player.addCard(deck.remove(0));
            }
        }
    }

    public void play() {
        dealCards();
        // Determine who starts with the 3 of diamonds
        Player starter = players.stream()
                                .filter(p -> p.hand.stream().anyMatch(c -> c.getRank() == 3 && c.getSuit() == 'D'))
                                .findFirst().orElse(players.get(0));
        turnOrder.add(starter);
        
        while (true) {
            Player currentPlayer = turnOrder.poll();
            turnOrder.add(currentPlayer); // Add back to end of queue
    
            if (!currentPlayer.hasCards()) {
                System.out.println(currentPlayer.name + " has won!");
                break;
            }
    
            Card playedCard = currentPlayer.playCard();
            if (currentPlay.isEmpty() || playedCard.compareTo(currentPlay.get(0)) > 0) {
                currentPlay.clear();
                currentPlay.add(playedCard);
                System.out.println(currentPlayer.name + " played " + playedCard.getRank() + " of " + playedCard.getSuit());
            } else {
                System.out.println(currentPlayer.name + " passes.");
                // Here you might want to implement logic for the player to actually choose to pass or play
            }
        }
    }

    public static void main(String[] args) {
        Big2 game = new Big2("Player 1", "Player 2", "Player 3", "Player 4");
        game.play();
    }
}