package week4;
interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card.");
    }
}
class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to UPI.");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        p1.pay(1200);
        p1.refund(200);
        System.out.println();
        p2.pay(800);
        p2.refund(100);
    }
}
