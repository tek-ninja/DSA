package Arrays;
import java.util.Scanner;

public class ChessSquareColorIdentifier {
    public static void main(String[] args) {
        System.out.println("Enter the coordinates of the chess square (e.g., a1, h8):");
        Scanner sc = new Scanner(System.in);
        String coordinates = sc.next();
        String result = "White";
        // Write your solution here.
        // Print "White" or "Black".
        char[] charArray = coordinates.toCharArray();
         if(charArray[0] == 'a' || charArray[0] == 'c' || charArray[0] == 'e' || charArray[0] == 'g' ) {
            if(charArray[1] % 2 != 0){
                result = "Black";
            } 
         }

         //Approach Two
        if(( coordinates.charAt(0) - 'a'+1 +   coordinates.charAt(1))%2 == 0)
            result = "Black";
       
        System.out.println(result);
        sc.close();
    }
}
