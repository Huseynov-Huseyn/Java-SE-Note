package src_homework.Lesson_7.Abstraction.CardGame;

import java.util.Random;

public class Deck {
    private final Card[] cards = new Card[28];
    private int selectedCardCount = 0;

    public Deck() {
        String[] suits = {"♥️", "♦️", "♣️", "♠️"};
        String[] numberCardRanks = {"7", "8", "9", "10"};
        String[] faceCardRanks = {"J", "Q", "K"};
        int index = 0;
        for (String suit : suits) {
            for (String rank : numberCardRanks) {
                cards[index] = new NumberCard(rank, suit);
                index++;
            }
            for (String rank : faceCardRanks) {
                cards[index] = new FaceCard(rank, suit);
                index++;
            }
        }
    }

    public void shuffle() {
        Random r = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            Card temporarily = cards[i];
            cards[i] = cards[j];
            cards[j] = temporarily;
        }
    }

    public Card[] dealCards(int cardCount) {
        if ((cardCount + selectedCardCount) <= cards.length) {
            Card[] playerDeck = new Card[cardCount];
            int a = 0;
            for (int i = selectedCardCount; i < (selectedCardCount + cardCount); i++) {
                playerDeck[a] = cards[i];
                a++;
            }
            selectedCardCount += cardCount;
            return playerDeck;
        } else {
            System.out.println("Deck doesnt have enough card! ");
            return null;
        }
    }

    public Card[] getCards() {
        return cards;
    }
}
