package src_homework.Lesson_8.ExceptionHandling.Calculator;

public class Division {
    double divideNumber(double number1, double number2) {
        if (number2 == 0) {
            throw new DivisionByZeroException("The divisor must not be 0");
        }
        return number1 / number2;
    }
}
