import java.util.Scanner;
public class Palindrome_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string name: ");
        String s1 = scan.next();
        String rev = "", temp = s1;
        s1 = s1.toLowerCase();
        for (int i = s1.length()-1; i >= 0 ; i--){
            rev += s1.charAt(i);
        }
        if (rev.equals(s1)) System.out.println(temp + " is a Palindrome.");
        else System.out.println(temp + " is not a palindrome.");
        scan.close();
    }
}
