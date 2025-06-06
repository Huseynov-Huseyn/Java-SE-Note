package src_homework.Lesson_7.Polymorphism.CalculatorApp;

public class ScientificCalculator extends Calculator {
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
