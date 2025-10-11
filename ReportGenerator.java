package week5.report;

import java.util.Scanner;
import week5.student.Address;
import week5.student.Student;

public class ReportGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        Address addr = new Address(city, state);
        Student student = new Student(name, rollNo, marks, addr);

        student.displayStudentDetails();

        sc.close();
    }
}
