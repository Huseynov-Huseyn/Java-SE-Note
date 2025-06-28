package src_homework.Lesson_8.ExceptionHandling.OrderProcessingSystem;

public class PaymentProcessor {
    public static void processPayment(double amount) {
        if (amount <= 0) {
            throw new PaymentProcessingException("Invalid payment error");
        }
        if (Math.random() < 0.1) {
            throw new PaymentProcessingException("Payment failed due to network error");
        }
        System.out.println("Payment processed successfully!");
    }
}
