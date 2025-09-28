package week3;

class Book {
    String title, author;
    double price;

    Book() {
        title = "PHP";
        author = " Marty Matthews";
        price = 300;
    }
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void displayBookDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println( "Price: " + price);
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling", 450.50);
        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
