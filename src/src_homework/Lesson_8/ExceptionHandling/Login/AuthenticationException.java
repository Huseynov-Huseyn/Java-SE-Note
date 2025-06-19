package src_homework.Lesson_8.ExceptionHandling.Login;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
