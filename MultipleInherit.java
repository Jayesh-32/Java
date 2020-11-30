interface xyz  // interface
{
    static final double pi=3.14;
    public void demo();  //function declaration
}
class def
{
    int k=10;
    void demo1()
    {
        System.out.println("In demo1 function:");
    }
}
public class MultipleInherit extends def implements xyz
{
    public void demo()
    {
        System.out.println("In demo funtion:");
    }
    public static void main(String[] args) 
    {
        MultipleInherit obj =new MultipleInherit();
        obj.demo1();
        obj.demo();
        
    }    
}
