package Arrays;
import java.util.Scanner;
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("Enter the number of stairs:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of distinct ways to climb to the top: " + climbStairs(n));
        sc.close();
    }
    //Recursive approach is always there
    
    public static int climbStairs(int n) {
        if (n <= 1) return 1;
        int first = 1, second = 1;
        for (int i = 2; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}