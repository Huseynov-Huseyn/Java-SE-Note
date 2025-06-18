package src_homework.Lesson_8.ExceptionHandling.BankingSystem;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
