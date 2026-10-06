import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print n rows, row i (1-indexed) containing i stars, right aligned
        // within a total width of n.
        leftHalfPyramid(n);

    }

    public static void leftHalfPyramid(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
