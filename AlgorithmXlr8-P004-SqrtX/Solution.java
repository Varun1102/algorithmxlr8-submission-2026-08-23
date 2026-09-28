import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        // Write your solution here.
        // Print the square root of x, rounded down to the nearest integer.
        System.out.println(isSqrt(x));
    }

    public static long isSqrt(long x){
        long i = 0;

        while (i * i <= x){
            i += 1;
        }
        return (int) (i-1);
    }
}
