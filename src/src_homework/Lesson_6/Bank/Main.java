package src_homework.Lesson_6.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100, 2000);
        account1.deposit(2000);
        account1.deposit(2100);
        account1.cashDraw(2500);
        account1.cashDraw(100);
    }
}
