package src_homework.Lesson_8.ExceptionHandling.OrderProcessingSystem;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
