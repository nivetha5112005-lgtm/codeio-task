package week3;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }

    public void setSalary(double s) {
        salary = s;
    }
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Kumar");
        e1.setId(101);
        e1.setSalary(35000);

        System.out.println("Employee Details:");
        System.out.println("Name  : " + e1.getName());
        System.out.println("ID    : " + e1.getId());
        System.out.println("Salary: " + e1.getSalary());
    }
}
