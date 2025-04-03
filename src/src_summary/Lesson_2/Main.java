package src_summary.Lesson_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        boolean lights = true;
        boolean police = false;

        // or operator
        System.out.println(lights || police);
        // and operator
        System.out.println(lights && police);
        // not
        System.out.println(!lights);

//        int mathRandomNumber=(int) (Math.random()*10);
//        System.out.println(mathRandomNumber);

        System.out.println((int) (Math.random() * 10));

//        Random random = new Random();
//        int randomNumber = random.nextInt(10);
//        System.out.println(a);

        System.out.println(new Random().nextInt(10));

    }
}
