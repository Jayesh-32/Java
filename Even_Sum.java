public class Even_Sum 
{
    public static void main(String args[])
    {
        int n=0,sum=0,count=0;
        do
        {
            sum=sum+n;
            n=n+2;
            count=count+1;
        }
        while(count<=10);
        System.out.println("Sum of First 10 Even Numbers is :"+sum);
    }
}
