package week4;
abstract class BankAccount {
    protected double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Current Balance:"+balance);
    }
}
class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000;
    SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account");
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account");
        }
        else {
            System.out.println("Withdrawal denied! Minimum balance of " + MIN_BALANCE + " must be maintained.");
        }
    }
}
class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = -5000;
    CurrentAccount(double balance) {
        super(balance);
    }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account");
    }
    @Override
    void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account");
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }
}
class BankAccount1 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(50000);
        BankAccount current = new CurrentAccount(7000);

        savings.deposit(2500);
        savings.withdraw(5000);
        savings.displayBalance();


        current.withdraw(6000);
        current.deposit(3000);
        current.displayBalance();
    }
}
