class AgeInsufficientException extends Exception
{
    AgeInsufficientException(String str) 
    {
       super(str);
    }  
}

class Voter
{ 
    String name;
    int age; 
    Voter(String name, int age)
    {
         this.name = name;
         this.age = age;
    }
    void checkAge ()throws AgeInsufficientException
    {
        //Instead if else using user exception 
        if (age < 18)
             throw new AgeInsufficientException(name + " is ineligible to vote.");//creation of Exception object .
           System.out.println(name + " can vote.");
    }
}
class UserDefExceptionDemo 
{
   public static void main(String[] args)
   {
       Voter v1 = new Voter("Manu", 18);
       Voter v2 = new Voter("Divya", 14);
       try
       {
           v1.checkAge();
           v2.checkAge();
        }
        catch(AgeInsufficientException ai)
        {
            System.out.println(ai);    
        }
   }

}