import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the mark:");
        int mark=input.nextInt();
        if(mark>=90)
        {
            System.out.println("Grade A");
        }
        else if(mark>=75)
        {
            System.out.println("Grade B");
        }
        else if(mark>=50)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
