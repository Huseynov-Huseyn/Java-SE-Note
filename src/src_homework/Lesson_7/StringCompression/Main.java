package src_homework.Lesson_7.StringCompression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your string : ");
        String word = scan.nextLine();
        int count = 1;
        String outPut = "";

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
            } else {
                outPut = outPut + word.charAt(i - 1) + count;
                count = 1;
            }
        }
        outPut = outPut + word.charAt(word.length() - 1) + count;
        System.out.println((outPut.length() <= word.length()) ? outPut : word);
    }
}