import java.util.Scanner;
public class String5 
{
    public static void main(String[] args) 
    {
     Scanner scan = new Scanner(System.in); 
     System.out.println("Enter string 1");
     String n1=scan.nextLine();
     System.out.println("Enter string 2");
     String n2=scan.nextLine();
     System.out.println("Enter string 3");
     String n3=scan.nextLine();
    
     System.out.println("\nThe Strings are:");
     System.out.println(n1);
     System.out.println(n2);
     System.out.println(n3);

     System.out.println("\nConverting into Lowercase: ");
     System.out.println(n1.toLowerCase());
     System.out.println(n2.toLowerCase());
     System.out.println(n3.toLowerCase());
    
     System.out.println("\nConverting into Uppercase: ");
     System.out.println(n1.toUpperCase());
     System.out.println(n2.toUpperCase());
     System.out.println(n3.toUpperCase());
     
     System.out.println("\nChecking Length:");
     System.out.println("Length of String 1: "+ n1.length());
     System.out.println("Length of String 2: "+ n2.length());
     System.out.println("Length of String 3: "+ n3.length());
    
     System.out.println("\nChecking String Empty: ");
     System.out.println(n1.isEmpty());
     System.out.println(n2.isEmpty());
     System.out.println(n3.isEmpty());
     
     System.out.println("\nChecking Two Strings Equal: ");
     System.out.println(n1.equalsIgnoreCase(n2));
     System.out.println(n1.equalsIgnoreCase(n3));
    
     System.out.println("\nConverting into Substrings: ");
     System.out.println("Substrings: "+ n1.substring(3,7));
     System.out.println("Substrings: "+ n2.substring(3,7));
     System.out.println("Substrings: "+ n3.substring(3,7)); 
    }
}
