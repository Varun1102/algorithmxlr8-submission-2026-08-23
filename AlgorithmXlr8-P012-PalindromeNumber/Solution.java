import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        // Write your solution here.
        // Print "true" if x is a palindrome, otherwise print "false".
        System.out.println(isValidPalindrome(x));
    }

    public static boolean isValidPalindrome(long n){
        if(n<0){
            return false;
        }
        long original = n;
        long reversed = 0;
        while(n != 0){
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed == original;
    }
}
