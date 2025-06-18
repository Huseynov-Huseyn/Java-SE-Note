package src_homework.Lesson_8.ExceptionHandling.BankingSystem;

import java.util.UUID;

public class Bank {
    BankAccount[] accounts = new BankAccount[3];
    int count = 0;

    boolean transferFunds(UUID from, UUID to, double amount) {
        BankAccount firstAcc = null;
        BankAccount secondAcc = null;
        for (BankAccount account : accounts) {

            if (account != null && from.equals(account.getAccountNumber())) {
                firstAcc = account;
            }
            if (account != null && to.equals(account.getAccountNumber())) {
                secondAcc = account;
            }
        }
        if (firstAcc == null) {
            throw new IllegalArgumentException("Source account not found");
        }
        if (secondAcc == null) {
            throw new IllegalArgumentException("Destination account not found");
        }

        try {
            if (firstAcc.withdrawAmount(amount)) {
                secondAcc.depositAmount(amount);
            }
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    void addAccount(BankAccount account) {
        if (count >= accounts.length) {
            BankAccount[] newBankAccs = new BankAccount[count + 3];
            for (int i = 0; i < accounts.length; i++) {
                newBankAccs[i] = accounts[i];
            }
            accounts = newBankAccs;
        }
        accounts[count] = account;
        count++;
    }

    BankAccount getBankAccountByID(UUID id) {
        for (BankAccount account : accounts) {
            if (id.equals(account.getAccountNumber())) {
                return account;
            }
        }
        return null;
    }
}