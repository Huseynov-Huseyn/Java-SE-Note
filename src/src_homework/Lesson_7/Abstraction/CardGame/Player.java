package src_homework.Lesson_7.Abstraction.CardGame;

public class Player {
    private final String name;
    private final Card[] cards;

    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void showPlayerDeck() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    public int showPlayerScore() {
        int totalScore = 0;
        for (Card c : cards) {
            totalScore += c.getCardPoint();
        }
        return totalScore;
    }
}
