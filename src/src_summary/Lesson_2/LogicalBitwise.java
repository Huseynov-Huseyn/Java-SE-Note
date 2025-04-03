package src_summary.Lesson_2;

public class LogicalBitwise {
    public static void main(String[] args) {
        int x = 5;
        boolean sonuc1 = (x > 0) || check();  // `kontrolEt()` ÇAĞRILMAZ
        boolean sonuc2 = (x > 0) | check();   // `kontrolEt()` ÇAĞRILIR

        System.out.println("sonuc1: " + sonuc1);
        System.out.println("sonuc2: " + sonuc2);


    }

    static boolean check() {
        System.out.println("check() metodu çağrıldı");
        return true;
    }


}
