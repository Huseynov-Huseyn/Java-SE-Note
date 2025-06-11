package src_homework.Lesson_7.Abstraction.CardGame;

public class NumberCard extends Card {

    public NumberCard(String rank, String suit) {
        super(rank, suit);
    }

    @Override
    public int getCardPoint() {
        return Integer.parseInt(rank);
    }

}
