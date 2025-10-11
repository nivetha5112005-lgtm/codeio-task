package week5;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }
    public synchronized void deposit(int amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Deposit amount must be positive!");
        }
        balance+= amount;
        System.out.println(Thread.currentThread().getName()+"deposited:"+amount+"| Balance:"+balance);
    }
    public synchronized void withdraw(int amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Tried to withdraw: "+amount);
        }
        balance -=amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + " | Balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}
class TransactionThread extends Thread {
    private BankAccount account;

    public TransactionThread(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) { // Each user performs 3 transactions
                int amount = (int) (Math.random() * 1000);
                boolean deposit = Math.random() > 0.5;

                if (deposit) {
                    account.deposit(amount);
                } else {
                    account.withdraw(amount);
                }

                Thread.sleep(500);
            }
        } catch (InsufficientBalanceException | InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " error: " + e.getMessage());
        }
    }
}

public class BankTransactionSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Starting with ₹1000

        Thread user1 = new TransactionThread(account, "User1");
        Thread user2 = new TransactionThread(account, "User2");
        Thread user3 = new TransactionThread(account, "User3");

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}
