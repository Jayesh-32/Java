import java.util.Scanner;
public class Addition
{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        try{
            int sum;
            System.out.println("Enter First Number : ");
            int a=scan.nextInt();
            System.out.println("Enter Second Number : ");
            int b=scan.nextInt();
            sum=a+b;
            System.out.println("Addition of two Number is "+ sum);
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }
}