package week3;

public class BankAccount {
    int accountNumber;
    double balance;

    BankAccount() {
        accountNumber = 0;
        balance = 0;
    }

    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited  : " + amount);
        System.out.println("New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
            System.out.println();
        }
        else {
            System.out.println("Insufficient balance!");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(12315, 1000);
        BankAccount acc2 = new BankAccount(15645, 30000);
        acc1.deposit(500);
        acc1.withdraw(200);

        acc1.withdraw(1500);

        acc2.deposit(1000);
        acc2.withdraw(2330);


    }
}
