import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print n rows, row i (1-indexed) containing i stars, left aligned.
        rightHalfPyramid(n);
    }

    public static void rightHalfPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
