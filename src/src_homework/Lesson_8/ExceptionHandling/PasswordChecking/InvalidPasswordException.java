package src_homework.Lesson_8.ExceptionHandling.PasswordChecking;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
