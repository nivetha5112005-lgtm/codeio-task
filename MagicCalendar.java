import java.util.Scanner;
public class MagicCalendar
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter year:");
        int year=input.nextInt();
        if(year%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not a Leap year");
        }
    }
}
