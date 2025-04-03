package src_summary.Lesson_2;

public class Ternary {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if (a > b) {
            System.out.println("a bigger than b");
        } else {
            System.out.println("b bigger than a");
        }

        System.out.println((a > b) ? "a boyukdur" : "b boyukdur");
        System.out.println((a > b) ? a - b : b - a);
        System.out.println("================");

        String xosbextlik = "";

        boolean sevgi = true;
        boolean hormet = true;

        xosbextlik = (sevgi == true && hormet == true) ? "he" : "yox";

        System.out.println(xosbextlik);

        System.out.println("================");

        int c = 15;
        int max = (a > b && a > c) ? a : (b > a && b > c) ? b : (c > a && c > b) ? c : b;
        System.out.println(max);

    }
}
