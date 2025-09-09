import java.util.Scanner;
public class FastRunner
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Arjun's speed time:");
        int time1=input.nextInt();
        System.out.println("Enter Varun's speed time:");
        int time2=input.nextInt();
        if(time1>time2)
        {
            System.out.println("Arjun");
        }
        else if(time1<time2)
        {
            System.out.println("Varun");
        }
        else
        {
            System.out.println("Tie");
        }
    }
}
