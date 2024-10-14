package Grok2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Card {
    private String suit;
    private String rank;
    private int pointValue;

    public Card(String suit, String rank, int pointValue) {
        this.suit = suit;
        this.rank = rank;
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }
}

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        List<Card> playerHand = new ArrayList<>();
        List<Card> dealerHand = new ArrayList<>();

        // 發牌
        playerHand.add(deck.dealCard());
        dealerHand.add(deck.dealCard());
        playerHand.add(deck.dealCard());
        dealerHand.add(deck.dealCard());

        System.out.println("你的手牌: " + playerHand);
        System.out.println("莊家的第一張牌: " + dealerHand.get(0));

        // 玩家輪
        while (true) {
            System.out.print("你要牌嗎? (y/n): ");
            if (!scanner.next().equalsIgnoreCase("y")) break;
            playerHand.add(deck.dealCard());
            System.out.println("你的手牌: " + playerHand);
            if (calculateHandValue(playerHand) > 21) {
                System.out.println("你爆牌了！");
                return;
            }
        }

        // 莊家輪
        while (calculateHandValue(dealerHand) < 17) {
            dealerHand.add(deck.dealCard());
        }

        System.out.println("你的牌: " + playerHand + " - 總點數: " + calculateHandValue(playerHand));
        System.out.println("莊家的牌: " + dealerHand + " - 總點數: " + calculateHandValue(dealerHand));

        int playerValue = calculateHandValue(playerHand);
        int dealerValue = calculateHandValue(dealerHand);

        if (playerValue > 21) {
            System.out.println("你爆牌了，莊家贏！");
        } else if (dealerValue > 21) {
            System.out.println("莊家爆牌了，你贏了！");
        } else if (playerValue > dealerValue) {
            System.out.println("你贏了！");
        } else if (playerValue < dealerValue) {
            System.out.println("莊家贏了！");
        } else {
            System.out.println("平局！");
        }
    }

    private static int calculateHandValue(List<Card> hand) {
        int value = 0;
        int aces = 0;

        for (Card card : hand) {
            value += card.getPointValue();
            if (card.toString().contains("Ace")) aces++;
        }

        while (value > 21 && aces > 0) {
            value -= 10;
            aces--;
        }

        return value;
    }
}