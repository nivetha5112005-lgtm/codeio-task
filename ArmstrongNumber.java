public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int original= n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        if (sum == original) {
            System.out.println(original+"is an Armstrong Number.");
        } else {
            System.out.println(original+"is NOT an Armstrong Number.");
        }
    }
}