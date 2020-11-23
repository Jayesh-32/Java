import java.util.Scanner;

public class Largest 
{
public static void main(String args[])
    {
        int a,b,c;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=scan.nextInt();

        System.out.println("Enter Second Number: ");
        b=scan.nextInt();

        System.out.println("Enter Third Number: ");
        c=scan.nextInt();
       
       if(a>b)
        {
            if(a>c)
            {
            System.out.println("The Largest number is:"+a);
            }
             else
            {
            System.out.println("The Largest number is:"+c);
            }
        }
        else if(b>c)
            {
            System.out.println("The Largest number is:"+b);
            }
             else
            {
            System.out.println("The Largest number is:"+c);
            }
    }    
}
