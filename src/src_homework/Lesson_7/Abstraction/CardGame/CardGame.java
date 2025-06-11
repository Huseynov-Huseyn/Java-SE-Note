package src_homework.Lesson_7.Abstraction.CardGame;

public class CardGame {

    Deck d = new Deck();
    Player[] players;
    int cardCount;

    public void startGame(int count) {
        if (count * 3 > d.getCards().length) {
            System.out.println("Player max card number is : " + (d.getCards().length / 3));
            return;
        }
        d.shuffle();
        cardCount = count;
        players = new Player[]{
                new Player("Huseyn", d.dealCards(cardCount)),
                new Player("Ali", d.dealCards(cardCount)),
                new Player("Umid", d.dealCards(cardCount))
        };
        showPlayerDeck();
        winnerSelect();
    }


    public void showPlayerDeck() {
        for (Player p : players) {
            System.out.println(p.getName() + "'s Deck : ");
            p.showPlayerDeck();
            System.out.println("total score : " + p.showPlayerScore());
            System.out.println("=========");

        }
    }

    public void winnerSelect() {
        int maxScore = 0;
        Player winner = players[0];
        boolean isDraw = false;
        for (Player p : players) {
            int i = p.showPlayerScore();
            if (i == maxScore) {
                isDraw = true;
            }
            if (i > maxScore) {
                maxScore = i;
                winner = p;
            }
        }
        System.out.println((isDraw) ? "Draw!" : "Winner is : " + winner.getName());
    }

}