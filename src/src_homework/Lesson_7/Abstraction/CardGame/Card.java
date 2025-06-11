package src_homework.Lesson_7.Abstraction.CardGame;

public abstract class Card {
    protected String suit;
    protected String rank;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public abstract int getCardPoint();

    @Override
    public String toString() {
        return suit + " " + rank;
    }
}
