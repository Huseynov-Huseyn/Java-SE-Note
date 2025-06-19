package src_homework.Lesson_8.ExceptionHandling.PasswordChecking;

public record Account(String name, String password) {

    boolean validatePassword() {
        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$")) {
            throw new InvalidPasswordException("at least 8 characters, at least one uppercase, lowercase, digir number");
        }
        return true;
    }
}
