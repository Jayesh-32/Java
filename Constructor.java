public class Constructor 
{
    int n1;
    int n2;
    Constructor()
    {
        n1=20;
        n2=30;
    }
    Constructor(int x)
    {
        n1=x;
    }
    Constructor(int x, int y)
    {
        n1=x;
        n2=y;
    }
    public void display()
    {
        System.out.println("Value 1: "+n1);
        System.out.println("Value 2: "+n2);
    }

    public static void main(String[] args) 
    {   
    Constructor c1=new Constructor();
    Constructor c2=new Constructor(50);
    Constructor c3=new Constructor(50,70);
    System.out.println("Inside default Constuctor:");
    c1.display();
    System.out.println("Inside Paramaterized Constuctor 1:");
    c2.display();
    System.out.println("Inside Paramaterized Constuctor 2:");
    c3.display();
    }   
}
