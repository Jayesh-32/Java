class X extends Thread
{
    int i;
    public void run()
    {
        try
        {
            for(i=0; i<=5; i++)
            {
                System.out.println("I ="+i);
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error is: "+e);
        }
    }
}
class Y extends Thread
{
    int j;
    public void run()
    {
        try
        {
            for(j=0; j<=5; j++)
            {
                System.out.println("J ="+j);
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error is: "+e);
        }
    }

}
public class Interface 
{
    public static void main(String[] args) 
    {
        X s1 = new X();
        Y t1 = new Y();
        s1.start();
        t1.start();
        
    }
    
}
