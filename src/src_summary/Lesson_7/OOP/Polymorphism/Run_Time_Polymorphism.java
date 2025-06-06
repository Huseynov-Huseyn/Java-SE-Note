package src_summary.Lesson_7.OOP.Polymorphism;

public class Run_Time_Polymorphism {
    public static void main(String[] args) {
        Car c = new Car();
        c.play();
    }

    public static class Vehicle {
        void play() {
            System.out.println("Hello World!");
        }
    }

    public static class Car extends Vehicle {
        //        Runtime polymorphism is method overriding
        @Override
        void play() {
            super.play();
            System.out.println("This is Car class");
        }
    }
}
