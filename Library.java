package week5;
import java.util.Scanner;

public class Library {

    class Book {
        String title;
        String author;
        double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void displayBookDetails() {
            System.out.println("Book Details:");
            System.out.println("Title :" + title);
            System.out.println("Author:" + author);
            System.out.println("Price :"+ price);
        }
    }
    void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title:");
        String title = sc.nextLine();

        System.out.print("Enter Author Name:");
        String author = sc.nextLine();

        System.out.print("Enter Book Price:");
        double price = sc.nextDouble();

        Book book = new Book(title, author, price);
        book.displayBookDetails();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        System.out.println(" Library System ");

        char choice;
        do {
            library.addBook();
            System.out.print("\nDo you want to add another book? (y/n): ");
            choice = sc.next().charAt(0);
            sc.nextLine();
        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}
