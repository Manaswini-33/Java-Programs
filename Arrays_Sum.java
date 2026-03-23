import java.util.Scanner;
class SumofArrays{
     void findsum(int n){
         int[] arr = new int[n];
         int sum = 0;
         if (n < 0) System.out.println("Invalid size of the Array.");
         else{
            Scanner scan = new Scanner(System.in);
            System.out.printf("\nEnter the elements in the array of the size (" + n + ") : ");
            for (int i =0 ; i < n; i++){
            arr[i] = scan.nextInt();
            }
            for (int i : arr){
            sum += i;
            }
             System.out.println("Sum of Elements in the array is : " + sum);
             scan.close();
         }
     }
}
public class Arrays_Sum {
    public static void main(String[] args){
        SumofArrays obj1 = new SumofArrays();
        obj1.findsum(5);
    }
}
