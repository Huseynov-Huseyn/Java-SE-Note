package src_homework.Lesson_7.Abstraction.CardGame;

public class FaceCard extends Card {
    public FaceCard(String rank, String suit) {
        super(rank, suit);
    }

    @Override
    public int getCardPoint() {
        return 10;
    }
}
