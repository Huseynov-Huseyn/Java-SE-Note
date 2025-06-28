package src_homework.Lesson_8.ExceptionHandling.OrderProcessingSystem;

public class PaymentProcessingException extends RuntimeException {
    public PaymentProcessingException(String message) {
        super(message);
    }
}
