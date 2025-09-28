package week3;

class Student {
    String name;
    int rollNumber;
    double marks;
    Student(String n, int r, double m) {
        name= n;
        rollNumber= r;
        marks= m;
    }
    void displayDetails() {
        System.out.println("Name    : " + name );
        System.out.println(" Roll No: " + rollNumber);
        System.out.println(" Marks  : " + marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student("anu", 101, 85.5);
        Student s2 = new Student("Arun", 102, 78.0);
        Student s3 = new Student("Priya", 103, 92.3);
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
