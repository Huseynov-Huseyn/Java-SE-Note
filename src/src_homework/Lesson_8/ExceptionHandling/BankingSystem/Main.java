package src_homework.Lesson_8.ExceptionHandling.BankingSystem;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Bank bankSystem = new Bank();
        UUID firstId = UUID.randomUUID();
        UUID secId = UUID.randomUUID();
        UUID thirdId = UUID.randomUUID();
        UUID fourthId = UUID.randomUUID();
        UUID random = UUID.randomUUID();
        bankSystem.addAccount(new BankAccount(firstId, "Huseyn", 210));
        bankSystem.addAccount(new BankAccount(secId, "ali", 150));
        bankSystem.addAccount(new BankAccount(thirdId, "Vali", 50));
        for (int i = 0; i < 100; i++) {
            bankSystem.addAccount(new BankAccount(fourthId, "Mossad", 854));
        }
        System.out.println(bankSystem.getBankAccountByID(firstId));
        try {
            System.out.println(bankSystem.transferFunds(random, secId, 110));
        } catch (RuntimeException e) {
            System.err.println(" Transfer error: " + e.getMessage());
        }

        System.out.println(bankSystem.transferFunds(firstId, secId, 120));
    }

}
