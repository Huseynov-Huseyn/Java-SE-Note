package src_homework.Lesson_1;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first side of rectangle : ");

        double firstSide = scan.nextDouble();
        System.out.print("Please enter second side of rectangle : ");
        double secondSide = scan.nextDouble();

        System.out.println("Perimeter of rectangle is : " + ((firstSide + secondSide) * 2));
        System.out.println("Area of rectangle is : " + (firstSide * secondSide));

        System.out.print("Please enter radius of circle : ");
        double circleRadius = scan.nextDouble();
        scan.close();

        System.out.println("Perimeter of circle is : " + (2 * Math.PI * circleRadius));
        System.out.println("Area of circle is : " + (Math.pow(circleRadius, 2) * Math.PI));

    }
}
