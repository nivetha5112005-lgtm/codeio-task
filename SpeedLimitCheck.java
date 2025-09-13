import java.util.Scanner;
public class SpeedLimitCheck
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the car speed:");
        double speed=input.nextDouble();
        if(speed>60)
        {
            System.out.println("overspeeding.pay fine");
        }
        else
        {
            System.out.println("you are within the speed limit");
        }
    }
}
