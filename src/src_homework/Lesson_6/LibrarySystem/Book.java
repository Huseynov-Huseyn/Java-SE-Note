package src_homework.Lesson_6.LibrarySystem;

public class Book {
    String title;
    Author author;
    int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book: " + title + " (Author: " + author.getName() + ", Publication Year: " + publicationYear + ")";
    }

}
