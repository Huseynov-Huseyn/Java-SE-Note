package src_homework.Lesson_8.ExceptionHandling.OrderProcessingSystem;

public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(String message) {
        super(message);
    }
}
