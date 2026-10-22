package Arrays;

import java.util.*;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number to add digits:");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum =0;
        while (num>0) {
          
            sum = sum + (num%10);
            num = num/10;
            if(num == 0 && sum > 10) {
                     num = sum;
                     sum = 0;
            }
        }
           System.out.println(sum);
        //Approach Two
        System.out.println("Enter the number to add digits:");
     Scanner sc1 = new Scanner(System.in);
        long num1 = sc.nextLong();
        long temp;
           if (num1 == 0) {
            temp = 0;
        }
        temp = 1 + (num1 - 1) % 9;
      System.out.println(temp);
        // Write your solution here.
        // Print the single-digit result of repeatedly summing num's digits.
    }
}
