package src_homework.Lesson_6.MemoryManagment;

public class MemoryDemo {

    public static void main(String[] args) {
        stackVsHeap();
    }

    public static void stackVsHeap() {
        int a = 10;
        int b = a;
        b = 20;
        System.out.println("a : " + a);
        System.out.println("b : " + b);

//      Heap : object in heap,reference in stack
        Student s1 = new Student("Huseyn");
        Student s2 = s1; // Both point the same object in heap
        s2.setName("Ali");
        System.out.println(s1); // Print Ali because both reference same object
        System.out.println(s2);
    }

    public static class Student {
        String name;

        public Student(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


}