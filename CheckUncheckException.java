import java.util.*;
class CheckUncheckException
{
    public static void main(String[] args)    
    {
          Scanner scan = new Scanner(System.in);
          System.out.println("---start---");
          try
          {
             int a = scan.nextInt();
             int b = scan.nextInt();
             int d = a / b;
             System.out.println("D = " + d);
             System.out.println("---end---");
             
           }
           catch(ArithmeticException ae)
           {
              System.out.println("b can't be zero : " + ae);
           }
           catch(NumberFormat Exception ne)
           {
              System.out.println("Datatype of the data entered is illegal : " + ne);
           }
           catch(Exception e)
           {
               System.out.println(e);

           }
    }
}