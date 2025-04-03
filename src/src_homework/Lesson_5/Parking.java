package src_homework.Lesson_5;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {

        String[][] carParking = new String[5][5];

        fillPark(carParking);
        carParking[2][3] = "Porche";
        carParking[1][2] = "Ferrari";
        carParking[4][1] = "BMW";

        showPark(carParking);

        System.out.println("===============");
        addCar(carParking);

        System.out.println("===============");
        showPark(carParking);

    }

    public static void fillPark(String[][] parkArea) {
        for (int i = 0; i < parkArea.length; i++) {
            for (int j = 0; j < parkArea[0].length; j++) {
                parkArea[i][j] = "Emp";
            }
        }
    }

    public static void showPark(String[][] parkArea) {
        for (String[] area : parkArea) {
            for (String car : area) {
                System.out.print(car + " ");
            }
            System.out.println(" ");
        }
    }

    public static void addCar(String[][] parkArea) {
        System.out.println("You can select your parking area");
        Scanner scan = new Scanner(System.in);
        System.out.print("enter row (1-5) : ");
        int row = (scan.nextInt()) - 1;

        System.out.print("enter column (1-5) : ");
        int column = (scan.nextInt()) - 1;
        scan.nextLine();

        if (parkArea[row][column].equals("Emp")) {
            System.out.print("Please enter your car information (name) : ");
            parkArea[row][column] = scan.nextLine();
            System.out.println("Your car has been parked at " + (row + 1) + ", " + (column + 1));

        } else {
            System.out.println("This area is not empty");
        }
    }
}
