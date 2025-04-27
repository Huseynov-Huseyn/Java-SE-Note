package src_summary.Lesson_6.ObjectMethods;

public class Student {
    private final int rollNo;
    private final String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return rollNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Same obj true
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class false

        Student other = (Student) obj;
        return this.rollNo == other.rollNo; // Looking for our hashCode method (rollNo)
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}