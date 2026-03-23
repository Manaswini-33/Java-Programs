import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = scan.nextInt();
        int digits = 0, temp = n, n1 = n, sum = 0;
        if (n < 0) System.out.println("\nInvalid number.");
        else{
            while( n > 0){
                n = n / 10;
                digits++;
            }
            while (n1 > 0){
                sum += (int)Math.pow((n1 % 10),digits);
                n1 = n1 / 10;
            }
        }
        if (temp == sum) System.out.println(temp + " is an Armstrong.");
        else System.out.println(temp + " is not an armstrong.");
        scan.close();
    }
}
