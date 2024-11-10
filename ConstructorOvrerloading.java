package OOPsSampleCode;

class Book {
    private String title;
    private String author;
    private int year;

    // Constructor 1
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Constructor 2 (Overloaded)
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + (year != 0 ? ", Year: " + year : ""));
    }
}

public class ConstructorOvrerloading {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Effective Java", "Joshua Bloch", 2008);

        book1.displayDetails();  // Output: Title: Java Programming, Author: James Gosling
        book2.displayDetails();  // Output: Title: Effective Java, Author: Joshua Bloch, Year: 2008
    }
}
