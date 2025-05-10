package src_homework.Lesson_7.StringOperations;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your string : ");
        String string = scan.nextLine().trim();

        System.out.println("Number of characters : " + string.length());
        System.out.println("String to uppercase : " + string.toUpperCase());
        System.out.println("String to lowercase : " + string.toLowerCase());
        System.out.println("Is string starts with 'A' : " + string.startsWith("A"));
        System.out.println("Is string end with 'Z' : " + string.endsWith("Z"));
        System.out.println("All 'e'  replace with 'E' : " + string.replace('e', 'E'));

        String[] splits = string.split("\\s+");
        for (String split : splits) {
            System.out.println(split);
        }

        System.out.println("First index of 'o' : " + string.indexOf('o'));

        String substring = string.substring(5, 10);
        System.out.println("Substring from 5th character to the 10th character : " + substring);

        System.out.println("Trimmed version : " + string);
    }
}
