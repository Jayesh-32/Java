public class MethodOver 
{
    double result;
    double area(int n1)
    {
        result = 3.14 * n1 * n1;
        return result;
    }
    double area (int n1, int n2)
    {
        result=n1*n2;
        return result;
    }
    double area(int n1,int n2,int n3)
    {
        result=n1*n2*n3;
        return result;
    }
    public static void main(String[] args) 
    {
        MethodOver d1= new MethodOver();
        double n1,n2,n3;
        n1=d1.area(10);
        System.out.println("Area of circle is: "+ n1);
        n2=d1.area(7,8);
        System.out.println("Area of Rectangle is: "+ n2);
        n3=d1.area(3,4,5);
        System.out.println("Volume of Cuboid is: "+ n3);
    }
}
