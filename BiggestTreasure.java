import java.util.Scanner;
public class BiggestTreasure
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three values:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Biggest Treasure is"+a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("Biggest Treasure is"+b);
        }
        else if(c>a&&c>b)
        {
            System.out.println("Biggest Treasure is"+c);
        }
        else
        {
            System.out.println("Equal Value");
        }
    }
}
