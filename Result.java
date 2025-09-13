import java.util.Scanner;
public class Result
{
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the student mark:");
            int mark=input.nextInt();
            if(mark>=50)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
    }
}


