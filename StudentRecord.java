package week4;
class Student1 {
    String name;
    int rollNo;
    int marks;

    Student1(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    Student1(Student1 s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.marks = s.marks;
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks  : " + marks);
    }
}
public class StudentRecord {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Reena", 101, 85);
        Student1 s2 = new Student1(s1);

        System.out.println("Original Student details");
        s1.display();

        System.out.println("Copied Student");
        s2.display();
    }
}

