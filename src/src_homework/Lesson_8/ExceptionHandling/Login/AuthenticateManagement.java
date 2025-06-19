package src_homework.Lesson_8.ExceptionHandling.Login;

public class AuthenticateManagement {

    static String login(String name, String password) throws AuthenticationException {
        if (!name.equals("Huseyn") || !password.equals("123456")) {
            throw new AuthenticationException("Username or password is wrong!");
        }
        return "Login successful!";
    }
}
