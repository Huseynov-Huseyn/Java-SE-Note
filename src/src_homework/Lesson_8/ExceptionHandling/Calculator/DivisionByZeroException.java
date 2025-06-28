package src_homework.Lesson_8.ExceptionHandling.Calculator;

public class DivisionByZeroException extends RuntimeException {

    public DivisionByZeroException(String message) {
        super(message);
    }

}
