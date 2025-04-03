package src_homework.Lesson_3;

import java.util.Scanner;

public class CurrencyConverter {

    static boolean isTrue(String currency) {
        return currency.equals("USD") || currency.equals("EURO") || currency.equals("AZN");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount to be converted : ");
        double amount = scan.nextDouble();

        System.out.print("Enter the source currency code : ");
        String sourceCurrency = scan.next();
        if (isTrue(sourceCurrency)) {
            System.out.print("Enter the target currency code : ");
            String targetCurrency = scan.next();
            if (isTrue(targetCurrency)) {
                switch (sourceCurrency) {
                    case "USD": {
                        switch (targetCurrency) {
                            case "AZN": {
                                System.out.println("Converted amount : " + amount * 1.7 + " AZN");
                                break;
                            }
                            case "EURO": {
                                System.out.println("Converted amount : " + amount * 0.95 + " EURO");
                                break;
                            }
                            default: {
                                System.out.println("Can not converted");
                            }
                        }
                        break;
                    }
                    case "EURO": {
                        switch (targetCurrency) {
                            case "AZN": {
                                System.out.println("Converted amount : " + amount * 1.78 + " AZN");
                                break;
                            }
                            case "USD": {
                                System.out.println("Converted amount : " + amount * 1.05 + " USD");
                                break;
                            }
                            default: {
                                System.out.println("Can not converted");
                            }
                        }
                        break;
                    }
                    case "AZN": {
                        switch (targetCurrency) {
                            case "USD": {
                                System.out.println("Converted amount : " + amount * 0.59 + " USD");
                                break;
                            }
                            case "EURO": {
                                System.out.println("Converted amount : " + amount * 0.56 + " EURO");
                                break;
                            }
                            default: {
                                System.out.println("Can not converted");
                            }
                        }
                        break;
                    }
                }
            } else {
                System.out.println("Enter a valid target currency code");
            }
        } else {
            System.out.println("Enter a valid source currency code");
        }


    }
}
