package src_homework.Lesson_3;

import java.util.Scanner;

public class CurrencyConverterSecond {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount to be converted : ");
        double amount = scan.nextDouble();

        System.out.print("Enter the source currency code : ");
        String sourceCurrency = scan.next().toUpperCase();
        System.out.print("Enter the target currency code : ");
        String targetCurrency = scan.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

        if (convertedAmount == -1) {
            System.out.println("Error : enter a valid currency!");
        } else {
            System.out.printf("Converted amount : %.2f %s\n", convertedAmount, targetCurrency);
        }

    }

    public static double convertCurrency(Double amount, String source, String target) {
        if (source.equals(target)) {
            return amount;
        }

        double rate = getExchangeRate(source, target);

        if (rate == -1) {
            return -1;
        }
        return amount * rate;
    }

    public static double getExchangeRate(String source, String target) {
        return switch (source + "_" + target) {
            case "EURO_USD" -> 1.1;
            case "EURO_AZN" -> 1.78;
            case "USD_EURO" -> 0.95;
            case "USD_AZN" -> 1.7;
            case "AZN_USD" -> 0.59;
            case "AZN_EURO" -> 0.56;
            default -> -1;
        };
    }

}
