package src_summary.Lesson_7.StringClass;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Huseyn";

        // Returns the number of characters in the string
        System.out.println("Length of this name string : " + name.length());

        // Returns the character at the specified index (0-based)
        System.out.println("Char at z index of name string : " + name.charAt(0));

        // Returns a substring from index 2 to 4 (5 is exclusive)
        System.out.println("Substring start 2. index end 5. index of name string : " + name.substring(2, 5));

        String surname = "ov";

        // Concatenates surname to the end of name
        System.out.println("Adding surname string to name string : " + name.concat(surname));

        // You can use lastindexof
        // Returns the index of the first occurrence of "ey" starting from index 1
        System.out.println(name.indexOf("ey", 1));

        // You can use only equals
        // Compares two strings, ignoring case sensitivity
        System.out.println(name.equalsIgnoreCase(surname));

        // you can use compareToIgnoreCases
        // Compares two strings lexicographically
        System.out.println(name.compareTo(surname));
        System.out.println(surname.compareTo(name));

        // Converts all characters in the string to lowercase
        System.out.println(name.toLowerCase());

        // Converts all characters in the string to uppercase
        System.out.println(name.toUpperCase());

        String unTrimedString = "  AAA   ";

        // Shows string before trimming (removing whitespace)
        System.out.println("Before trim method : " + unTrimedString);

        // Trims leading and trailing whitespace from the string
        System.out.println("After trim method : " + unTrimedString.trim());

        // Replaces all 'A' characters with 'C'
        String replacedString = unTrimedString.replace('A', 'C');
        System.out.println(replacedString);

        // Checks if the string contains character 'A'
        System.out.println(replacedString.contains("A"));

        // Converts the string to a character array
        char[] charArray = replacedString.toCharArray();
        System.out.println(charArray);

        // Checks if the string starts with the given prefix
        System.out.println(name.startsWith("H"));

    }
}
