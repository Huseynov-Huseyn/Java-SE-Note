package src_summary.Lesson_7.StringClass;

public class StringConstructors {
    public static void main(String[] args) {

        // Create a String from a byte array using the platform's default charset
        // Note: You can also use an int array with Unicode code points in another constructor
        byte[] arrByte = new byte[]{65, 66, 67}; // ASCII values for A, B, C
        String s1 = new String(arrByte); // Output: "ABC"
        System.out.println(s1);

        // Create a String from a specific range of the byte array (starting at index 1, length 2)
        String s2 = new String(arrByte, 1, 2); // Output: "BC"
        System.out.println(s2);

        // Create a String from a character array
        char[] arrChar = new char[]{'H', 'E', 'L', 'L', 'O'};
        String s3 = new String(arrChar); // Output: "HELLO"
        System.out.println(s3);

        // Create a String from a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        String s4 = new String(sb); // Output: "Hello"
        System.out.println(s4);

        // Optional: You can also use a StringBuilder in a similar way
        // StringBuilder sbuilder = new StringBuilder("World");
        // String s5 = new String(sbuilder); // Output: "World"
        // System.out.println(s5);
    }
}
