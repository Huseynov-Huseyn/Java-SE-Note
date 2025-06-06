package src_homework.Lesson_7.Polymorphism.CalculatorApp;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 15));
        System.out.println(cal.add(10, 15, 20));
        System.out.println(cal.add(10.8, 15.5));

        ScientificCalculator scal = new ScientificCalculator();
        System.out.println(scal.power(2, 5));
    }
}
