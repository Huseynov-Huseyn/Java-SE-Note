package src_homework.Lesson_8.ExceptionHandling.Login;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = scan.next();
        System.out.print("Please enter your password : ");
        String password = scan.next();
        scan.close();
        try{
            System.out.println(AuthenticateManagement.login(name, password));
        }catch (AuthenticationException e){
            System.err.println(e.getMessage());
        }
    }
}
