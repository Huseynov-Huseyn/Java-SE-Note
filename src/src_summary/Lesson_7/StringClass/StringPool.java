package src_summary.Lesson_7.StringClass;

public class StringPool {
    public static void main(String[] args) {
        // String literal usage; "abc" is stored in the String Pool
        String s1 = "abc";
        String s2 = "abc";

        // s1 and s2 point to the same object in the String Pool, so the references are equal
        System.out.println(s1 == s2); // true

        // The 'new' keyword creates two separate String objects in the heap memory
        String s3 = new String("abc");
        String s4 = new String("abc");

        // s3 and s4 have the same content, but different references
        System.out.println(s3 == s4); // false

        // s5 creates a new String object in the heap
        String s5 = new String("world");

        // intern() returns the reference from the String Pool if it exists, or adds it to the pool
        String s6 = s5.intern();

        // s7 is a String literal, so it refers to the object in the String Pool
        String s7 = "world";

        // s6 and s7 refer to the same object in the String Pool, so the references are equal
        System.out.println(s6 == s7); // true
    }
}
