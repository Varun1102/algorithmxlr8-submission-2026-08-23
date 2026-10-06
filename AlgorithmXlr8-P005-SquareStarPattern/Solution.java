import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print an n x n square of stars, one row per line.
        squareStar(n);
    }

    public static void squareStar(int num){
        for(int i=1; i<=num; i++){
            for(int j = 1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
