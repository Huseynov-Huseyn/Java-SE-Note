package src_homework.Lesson_6.LibraryManagement;

public class Library {
    String libraryName;
    String address;
    Book[] books;


    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
        this.books = new Book[10];
    }


    public void addBook(Book book) {
        int i = 0;
        while (i < books.length && books[i] != null) {
            i++;
        }
        if (i < books.length) {
            books[i] = book;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getIsbn().equals(isbn)) {
                books[i] = null;
                return;
            }
        }
        System.out.println("Can not find book with this isbn!");
    }

    public Book findBook(String isbn) {
        for (Book b : books) {
            if (b != null && b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String booksInfo = "";
        for (Book book : books) {
            if (book != null) {
                booksInfo += book + "\n";
            }
        }

        return "Library { " +
                "Library Name: '" + libraryName + "', " +
                "Address: '" + address + "', " +
                "Books: [" + booksInfo + "] }";
    }

}