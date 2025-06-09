package src_homework.Lesson_7.Abstraction.CardGame;

public class CardGame {
    public static void main(String[] args) {

        Deck d = new Deck();
        d.shuffle();
        int cardCount = 2;

        Player player1 = new Player("Huseyn", d.dealCards(cardCount));
        player1.showPlayerDeck();
        System.out.println("Player score is : " + player1.showPlayerScore());
        System.out.println("==========");
        Player player2 = new Player("Ali", d.dealCards(cardCount));
        player2.showPlayerDeck();
        System.out.println("Player score is : " + player2.showPlayerScore());

        if (player2.showPlayerScore() != player1.showPlayerScore()) {
            System.out.println((player2.showPlayerScore() > player1.showPlayerScore()) ? "Player 2 win" : "Player 1 win");
        } else {
            System.out.println("Draw!");
        }
    }
}