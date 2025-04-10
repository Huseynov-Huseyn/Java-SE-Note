package src_homework.Lesson_5;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many books would you like to add : ");
        int bookCount = scan.nextInt();
        String[][] library = new String[bookCount][2];
        scan.nextLine();
        for (int i = 1; i <= bookCount; i++) {
            System.out.print(i + ". Book Name : ");
            library[i - 1][0] = scan.nextLine();

            System.out.print(i + ". Author Name : ");
            library[i - 1][1] = scan.nextLine();
            System.out.println();

        }
        System.out.println("Library : ");

        for (int i = 1; i <= bookCount; i++) {
            System.out.println(i + ". Book Name : " + library[i - 1][0]);

            System.out.println(i + ". Author Name : " + library[i - 1][1]);
            System.out.println();

        }

    }
}
