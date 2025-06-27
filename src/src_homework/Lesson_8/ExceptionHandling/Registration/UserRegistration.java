package src_homework.Lesson_8.ExceptionHandling.Registration;

public class UserRegistration {
    public static boolean registerUser(String username, String password) throws UserRegistrationException {
        if (username.length() < 5 || password.length() < 5) {
            throw new UserRegistrationException("Username or password must be bigger than 4");
        }
        return true;
    }
}
