package src_homework.Lesson_6.Bank;

public class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(int amount) {
        System.out.println(amount + "$ added");
        balance += amount;
        System.out.println("your new balance is: " + balance);
        System.out.println("============");
    }

    void cashDraw(int amount) {
        if (amount > balance) {
            System.out.println("You don't have enough money !");
        } else {
            System.out.println(amount + "$ cashed");
            balance -= amount;
            System.out.println("your new balance is: " + balance);
        }
        System.out.println("============");
    }
}
