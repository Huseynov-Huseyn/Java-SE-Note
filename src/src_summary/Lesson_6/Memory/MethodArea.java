package src_summary.Lesson_6.Memory;

public class MethodArea {

    public static void main(String[] args) {
        Geeks g = new Geeks();

        //Method argument:2,5 | return address : sum
        int sum = sum(2, 5);

        // Calling the Display method
        g.Display();
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static class Geeks {

        // static variables are stored in the Method Area
        static int v = 100;

        // instance variables are stored in the Heap
        int i = 10;

        public void Display() {
            // local variables are stored in the Stack
            int s = 20;

            System.out.println(v);
            System.out.println(s);
        }
    }

}
