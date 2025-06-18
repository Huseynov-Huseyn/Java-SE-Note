package src_homework.Lesson_8.ExceptionHandling.BankingSystem;

import java.util.UUID;

public class BankAccount {
    private final UUID accountNumber;
    private final String accountHolder;
    private double balance;

    public BankAccount(UUID accountNumber, String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount : " +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance;
    }

    void depositAmount(double amount) {
        balance += amount;
        System.out.println(amount + " added to balance!");
    }

    boolean withdrawAmount(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Amount  bigger than balance!");
        }
        balance -= amount;
        return true;
    }

}