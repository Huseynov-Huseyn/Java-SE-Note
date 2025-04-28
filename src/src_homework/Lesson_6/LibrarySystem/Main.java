package src_homework.Lesson_6.LibrarySystem;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("J.K.Rowling", 1965);
        Author author2 = new Author("George Orwell", 1903);
        Author author3 = new Author("Harper Lee", 1926);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        System.out.println();
        System.out.println();

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, 1997);
        Book book2 = new Book("1984", author2, 1949);
        Book book3 = new Book("To Kill a Mockingbird", author3, 1960);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}
