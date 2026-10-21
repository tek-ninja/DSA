package Arrays;

import java.util.*;

public class LastMostSixNumerical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int temp = num;
    int index = 0;
    int firstSixIdx = -1;
    
    // Scan digits from right to left to find the leftmost 6
    while (temp > 0) {
        if (temp % 10 == 6) {
            firstSixIdx = index; // Overwrites previous, saving the leftmost one found so far
        }
        temp /= 10;
        index++;
    }
    
    // If a 6 was found, add 3 * (10 ^ firstSixIdx) to turn that 6 into a 9
    if (firstSixIdx != -1) {
        num += 3 * Math.pow(10, firstSixIdx);
    }
        System.out.println(num);
        // Write your solution here.
        // Print the maximum number after changing at most one digit 6 to 9.
        sc.close();
    }

}

