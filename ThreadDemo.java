class Thread1 extends Thread
{
     public void run()
     {
         System.out.println("Thread1 is running.");
         for (int i = 0; i < 5; i++)
         {
             System.out.println("I = " + i);
         }
     }
}
class Thread2 implements Runnable
{
     public void run()
     {
         System.out.println("Thread2 is running.");
         for (int j = 0; j < 5; j++)
         {
             System.out.println("J = " + j);
         }
     }
}
class Thread3 extends Thread 
{
     public void run()
     {   
         try
         {
            System.out.println("Thread3 is running.");
            for (int k = 0; k < 5; k++)
            {
               System.out.println("K = " + k);
            }
            Thread.sleep(2000);
         }
         catch(InterruptedException ie)
         {
             System.out.println(ie);
         }
     }
}
class ThreadDemo
{
   public static void main(String[] args)
   {
         Thread1 t1 =  new Thread1();
         Thread2 t2 =  new Thread2();
         Thread3 t3 =  new Thread3();
         t1.start();
         new Thread(t2).start();
         t3.start();
   }
}