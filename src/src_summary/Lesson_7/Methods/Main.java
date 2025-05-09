package src_summary.Lesson_7.Methods;

public class Main {
    public static void main(String[] args) {

        // Predefined method example: Math.random() returns a random double between 0.0 and 1.0
        double random = Math.random();

        // User-defined method: calls the sum method with integer parameters
        sum(2, 5);

        // Printing the random number generated above
        System.out.println(random);

        // Method Overloading: calling different versions of the sum method
        sum(2, 2);           // Calls the sum method with int parameters
        sum(2.2, 2.4);       // Calls the overloaded sum method with double parameters

        // Recursion method: calculates the factorial of 5
        System.out.println(factorial(5)); // Output: 120
    }

    // User-defined method to add two integers
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    // Overloaded method: adds two double values
    public static double sum(double n1, double n2) {
        return n1 + n2;
    }

    // Recursive method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 1) {
            return 1; // Base case: factorial of 1 is 1
        }
        return n * factorial(n - 1); // Recursive call: n * factorial of (n-1)
    }
}
