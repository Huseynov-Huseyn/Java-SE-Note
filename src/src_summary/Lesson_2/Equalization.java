package src_summary.Lesson_2;

public class Equalization {
    public static void main(String[] args) {
        int c = 5;
        int d = 5;
        System.out.println(c == d);
//        System.out.println(c.equals(d));
//        Line 12 is wrong, because primitive datatypes can't use equals

        String a = "Huseyn";
        String b = "Huseyn";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String e = new String("Huseyn");
        String f = new String("Huseyn");
        System.out.println(e == f);
        System.out.println(e.equals(f));
    }
}
