package src_homework.Lesson_6.LibraryManagement;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("12345", "Java Basics", "John Doe", "Tech Press", 2020, 3);
        Book book2 = new Book("67890", "Advanced Java", "Jane Smith", "Code Press", 2021, 5);
        Book book3 = new Book("54321", "Spring Framework", "Alex Brown", "Spring Press", 2019, 7);
        Book book4 = new Book("98765", "Clean Code", "Robert Martin", "Prentice Hall", 2008, 10);
        Book book5 = new Book("11223", "Effective Java", "Joshua Bloch", "Addison-Wesley", 2018, 4);

        Library lib = new Library("National Library", "3, Huseyn Javid Avenue, Baku, Azerbaijan");
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);
        System.out.println(lib.findBook("11223"));
        lib.removeBook("11223");

        System.out.println(lib);

    }

}
