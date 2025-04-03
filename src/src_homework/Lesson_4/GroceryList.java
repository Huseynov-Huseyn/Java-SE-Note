package src_homework.Lesson_4;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        String[] list = new String[5];
        int a = 1;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter your " + (i + 1) + " grocery item : ");
            list[i] = scan.nextLine();
        }
        scan.close();
        System.out.println("\n🎉 Here's your awesome grocery list! 🎊");

        for (String item : list) {
            System.out.println("Your " + a + " item is : " + item);
            a++;
        }
        System.out.println("\n🛍️ Happy Shopping! Don't forget to grab everything! 🛒");
    }
}
