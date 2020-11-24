import java.util.Scanner;
public class Calculator
{
    public static void main(String args[])
    {
        double n1,n2,result;
        int x;
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter First Number: ");
        n1=scan.nextDouble();
        System.out.println("Enter First Number: ");
        n2=scan.nextDouble();

        System.out.println("1.Addition , 2.Subtraction , 3.Multipilcation , 4.Division ");
        System.out.println("Enter Opertion Number Which has to perform: ");
        x=scan.nextInt();

        switch(x)
        {
            case 1:
            result = n1 + n2;
            System.out.println("Addition is : "+result);
            break;

            case 2:
            result = n1 - n2;
            System.out.println("Subtraction is : "+result);
            break;

            case 3:
            result = n1 * n2;
            System.out.println("Multiplication is: "+result);
            break;

            case 4:
            result = n1 / n2;
            System.out.println("Division is : "+result);
            break;

            default:
            System.out.println("Error! Enter correct Opertion Number");
            return;
        }
    }
    
}
