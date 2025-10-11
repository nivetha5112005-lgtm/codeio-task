package week5.student;

public class Student {
    private String name;
    private int rollNo;
    private double marks;
    private Address address; // Aggregation (has-an Address)

    public Student(String name, int rollNo, double marks, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.address = address;
    }

    public void displayStudentDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("--- Address ---");
        address.displayAddress();
    }
}
