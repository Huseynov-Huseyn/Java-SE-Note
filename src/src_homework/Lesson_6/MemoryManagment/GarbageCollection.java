package src_homework.Lesson_6.MemoryManagment;

public class GarbageCollection {
    public static void main(String[] args) {
//        Create a student object
        Student s1 = new Student("Huseyn");

//      Making this object unreachable
        s1 = null;
//      Printing object before garbage collector
        System.out.println(s1);
//      Calling garbage collector
        runGarbageCollector();
//      Printing Object after garbage collector
        System.out.println(s1);
    }

    public static void runGarbageCollector() {
        System.gc();
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
