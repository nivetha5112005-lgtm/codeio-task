package week4;
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class TextBook extends Book {
    String subject;

    TextBook(String title, String author, double price, String subject) {
        super(title, author, price);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Magazine extends Book {
    String month;

    Magazine(String title, String author, double price, String month) {
        super(title, author, price);
        this.month = month;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Month: " + month);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        TextBook t1 = new TextBook("Java Programming", "James Gosling", 550, "Computer Science");
        Magazine m1 = new Magazine("PHP", "Marty Matthews", 150, "October");
        t1.displayDetails();

        m1.displayDetails();
    }
}

