import java.util.Scanner;
public class RobotAssistant
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two integer:");
        int a= input.nextInt();
        int b= input.nextInt();
        System.out.println("Enter the operation 1 to 4");
        System.out.println("1-Addition");
        System.out.println("2-subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        int op=input.nextInt();
        if(op==1)
        {
            System.out.println("Addition:"+(a+b));
        }
        else if(op==2)
        {
            System.out.println("Subtraction:"+(a-b));
        }
        else if(op==3)
        {
            System.out.println("Multiplication:"+(a*b));
        }
        else if(op==4)
        {
            System.out.println("Division:"+(a/b));
        }
    }
}
