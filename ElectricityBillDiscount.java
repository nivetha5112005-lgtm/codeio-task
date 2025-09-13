import java.util.Scanner;
public class ElectricityBillDiscount
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Electricity bill for find the discount:");
        int bill=input.nextInt();
        double discount=0;
        double a;
        if(bill>=500 && bill<=1000)
        {
            discount=bill*0.05;
            System.out.println("5% Discount:"+(discount));
        }
        else if(bill>1000)
        {
            discount=bill*0.10;
            System.out.println("10% Discount:"+discount);
        }
        else
        {
            System.out.println("No Discount.pay the full bill");
        }
        a=bill-discount;
        System.out.println("Electricity bill is:"+a);
    }
}
