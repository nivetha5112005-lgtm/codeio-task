package week4;
class Employee {
    double getBonus() {
        return 0;
    }
}

class Manager extends Employee {
    @Override
    double getBonus() {
        return 8000;
    }
}
class Developer extends Employee {
    @Override
    double getBonus() {
        return 5000;
    }
}
public class EmployeeBonus{
    public static void main(String[] args) {
        Employee e1=new Manager();
        System.out.println("Bonus:"+e1.getBonus());
        Employee e2=new Developer();
        System.out.println("Bonus:"+e2.getBonus());
    }
}
