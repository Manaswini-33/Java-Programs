import java.io.*;
import java.util.*;
class ExceptionDemo
{
   public static void main(String[] args) throws ArithmeticException
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the age : ");
       int age = scan.nextInt();
       FileReader abc = null;
       try
       {
          int a = 9, b = 0;
          int[] arr = new int[4];
          if (age < 18)
          {
                throw new ArithmeticException("Ineligible to vote.");
          }
          arr[7] = 50;
          abc = new FileReader("abc.txt");
          System.out.println(a/b);
       }
       catch(ArithmeticException ae)
       {
           System.out.println(ae);
       }
       catch(ArrayIndexOutOfBoundsException ai)
       {
           System.out.println("Array size is only 4 but trying to insert the 7th element. " +ai);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       finally
       {
           try
           {
              if(abc != null)
                  abc.close();
           }
           catch(IOException ie)
           {
               System.out.println(ie);
           }
           System.out.println("\nProgram finished.");
       }
   }
}