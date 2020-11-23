import java.util.Scanner;
public class Marks 
{
    public static void main(String args[])
    {
        int marks;
        System.out.println("Enter Marks Obtained: ");
        Scanner scan= new Scanner(System.in);
        marks=scan.nextInt();
        if(marks>40)
        {
            System.out.println("The Student is Pass");
        }
        else
        {
            System.out.println("The Student is Fail");
        }
    }
}
    
