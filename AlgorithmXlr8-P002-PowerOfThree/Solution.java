import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // Write your solution here.
        // Print "true" if n is a power of three, otherwise print "false".
        Main main = new Main();
        System.out.println(main.isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(long n){
        if(n<1){
            return false;
        }

        while(n>1){
            if(n % 3 != 0){
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
