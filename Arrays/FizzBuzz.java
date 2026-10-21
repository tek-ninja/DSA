package Arrays;

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements for FizzBuzz:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] numbers = new String[n]; 
        
        // Minor optimization: Pre-caching common string literals
        final String FIZZ = "Fizz";
        final String BUZZ = "Buzz";
        final String FIZZBUZZ = "FizzBuzz";

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) { // i % 15 is slightly faster than i % 3 && i % 5
                numbers[i - 1] = FIZZBUZZ;
            } else if (i % 3 == 0) {
                numbers[i - 1] = FIZZ;
            } else if (i % 5 == 0) {
                numbers[i - 1] = BUZZ;
            } else {
                numbers[i - 1] = Integer.toString(i); // Integer.toString() can be faster than String.valueOf()
            }
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}