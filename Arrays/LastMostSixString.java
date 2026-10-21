package Arrays;
import java.util.*;

public class LastMostSixString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] charArray = num.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
                if(charArray[i] == '6') {
                    charArray[i] = '9';
                    break;
                }
        }
        String str = new String(charArray);
        System.out.println(str);
        // Write your solution here.
        // Print the maximum number after changing at most one digit 6 to 9.
        sc.close();
    }
}
