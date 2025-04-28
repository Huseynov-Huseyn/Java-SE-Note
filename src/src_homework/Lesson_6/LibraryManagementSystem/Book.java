package src_homework.Lesson_6.LibraryManagementSystem;

public class Book {

    String isbn;
    String title;
    String author;
    String publisher;
    int year;
    int numberOfCopies;

    public Book(String isbn, String title, String author, String publisher, int year, int numberOfCopies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfCopies = numberOfCopies;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book {" + "\n" +
                "  ISBN            : '" + isbn + "',\n" +
                "  Title           : '" + title + "',\n" +
                "  Author          : '" + author + "',\n" +
                "  Publisher       : '" + publisher + "',\n" +
                "  Year            : " + year + ",\n" +
                "  Number of Copies: " + numberOfCopies + "\n" +
                "}";
    }

}
