import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Blackjackauto {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int[] POINT_VALUES = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
    private static final Object[] RANKs = null;

    private List<String> deck;
    private List<String> playerHand;
    private List<String> dealerHand;
    private Random random;

    public Blackjackauto() {
        deck = new ArrayList<>();
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
        random = new Random();
        initializeDeck();
    }

    private void initializeDeck() {
        deck.clear();
        for (String suit : SUITS) {
            for (int i = 0; i < RANKS.length; i++) {
                deck.add(RANKS[i] + " of " + suit);
            }
        }
    }

    private String dealCard() {
        if (deck.isEmpty()) {
            initializeDeck();
        }
        int index = random.nextInt(deck.size());
        String card = deck.get(index);
        deck.remove(index);
        return card;
    }

    private int handValue(List<String> hand) {
        int value = 0;
        int aces = 0;

        for (String card : hand) {
            String rank = card.split(" ")[0];
            if (rank.equals("Ace")) {
                aces++;
            } else {
                value += POINT_VALUES[findRankIndex(rank)];
            }
        }

        for (int i = 0; i < aces; i++) {
            if (value + 11 <= 21) {
                value += 11;
            } else {
                value += 1;
            }
        }

        return value;
    }

    private int findRankIndex(String rank) {
        for (int i = 0; i < RANKS.length; i++) {
            if (RANKS[i].equals(rank)) {
                return i;
            }
        }
        return -1;
    }

    public void play() {
        playerHand.add(dealCard());
        dealerHand.add(dealCard());
        playerHand.add(dealCard());

        System.out.println("Player's hand: " + playerHand);
        System.out.println("Dealer's hand: [" + dealerHand.get(0) + ", Hidden]");

        while (handValue(playerHand) < 21) {
            System.out.print("Do you want to hit or stand? ");
            // Here you would normally get input, but for automation:
            if (handValue(playerHand) <= 16) { // Simple strategy
                playerHand.add(dealCard());
                System.out.println("Player hits: " + playerHand);
            } else {
                break;
            }
        }

        while (handValue(dealerHand) < 17) {
            dealerHand.add(dealCard());
            System.out.println("Dealer hits: " + dealerHand);
        }

        int playerValue = handValue(playerHand);
        int dealerValue = handValue(dealerHand);

        System.out.println("Player's hand: " + playerHand + " (" + playerValue + ")");
        System.out.println("Dealer's hand: " + dealerHand + " (" + dealerValue + ")");

        if (playerValue > 21) {
            System.out.println("Player busts! Dealer wins!");
        } else if (dealerValue > 21) {
            System.out.println("Dealer busts! Player wins!");
        } else if (playerValue > dealerValue) {
            System.out.println("Player wins!");
        } else if (playerValue < dealerValue) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        Blackjackauto game = new Blackjackauto();
        game.play();
    }
}