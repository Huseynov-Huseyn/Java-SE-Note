package src_homework.Lesson_8.ExceptionHandling.Calculator;

public class DivisionByZeroException extends RuntimeException {
    private final String message;

    public DivisionByZeroException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
