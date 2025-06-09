package src_homework.Lesson_7.Abstraction.CardGame;

public record Card(String rank, String suit) {
    public static int valueOfCard(String rank) {
        return switch (rank) {
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            default -> 0;
        };
    }
}
