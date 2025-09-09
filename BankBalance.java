import java.util.*;
public class BankBalance
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the bank balance:");
        int balance=input.nextInt();
        if(balance>0)
        {
            System.out.println("possitive balance");
        }
        else if(balance<0)
        {
            System.out.println("overdraft");
        }
        else
        {
            System.out.println("zero balance");
        }

    }
}
