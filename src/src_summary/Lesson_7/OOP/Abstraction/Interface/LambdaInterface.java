package src_summary.Lesson_7.OOP.Abstraction.Interface;

@FunctionalInterface
interface MyFunctionalInterface {
    void singleAbstractMethod();
}

public class LambdaInterface {
    public static void main(String[] args) {

        // Lambda implementation of the functional interface
        MyFunctionalInterface lambdaImplementation = () -> {
            System.out.println("Called using lambda!");
        };

        lambdaImplementation.singleAbstractMethod();

        // Traditional anonymous class implementation for comparison
        MyFunctionalInterface traditionalImplementation = new MyFunctionalInterface() {
            @Override
            public void singleAbstractMethod() {
                System.out.println("Called using traditional anonymous class!");
            }
        };

        traditionalImplementation.singleAbstractMethod();
    }
}
