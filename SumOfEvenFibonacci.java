class SumOfEvenFibonacciDemo{
     void fibonacci(int N){
            int a = 0, b=1, sum = 0, c;
            if (N < 0)
                System.out.println("Fibonacci Sequence can't be determined.");
            System.out.println("\nSum of all even terms in the Fibonacci sequence : ");
            for (int i = 0; i < N; i++){
                if (a %2 == 0){
                    sum += a;
                }
                c = a+b;
                a = b;
                b = c;
            }
            System.out.print(sum);
        } 
}
public class SumOfEvenFibonacci {
    public static void main(String[] args){
        SumOfEvenFibonacciDemo obj1 = new SumOfEvenFibonacciDemo();
        obj1.fibonacci(-1);
    }
}
