package week4;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}
class Student extends Person {
    int marks;
    char grade;

    Student(String name, int age, int marks, char grade) {
        super(name,age);
        this.marks = marks;
        this.grade = grade;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
class GraduateStudent extends Student {
    String researchTopic;

    GraduateStudent(String name, int age, int marks, char grade, String researchTopic) {
        super(name, age, marks, grade);
        this.researchTopic = researchTopic;
    }

    void displayGraduateStudent() {
        displayStudent();
        System.out.println("Research Topic: "+researchTopic);
    }
}
public class StudentGrading {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("Reena", 24, 88, 'A', "Artificial Intelligence");
        g.displayGraduateStudent();
    }
}
