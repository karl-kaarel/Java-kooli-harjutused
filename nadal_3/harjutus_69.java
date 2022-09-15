package nadal_3;
import java.util.Scanner;

public class harjutus_69 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Type a text: ");
            String text = reader.nextLine();

            if (palindrome(text)) {
                System.out.println("The text is a palindrome!");
            } else {
                System.out.println("The text is not a palindrome!");
            }
        }
    }

    public static boolean palindrome(String text) {
        String lower = text.toLowerCase();
        int left = 0, right = text.length() - 1;
        
        while(left < right){
            if(lower.charAt(left) != lower.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
