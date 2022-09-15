package nadal_3;
import java.util.Scanner;

public class harjutus_50 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Your name: ");
            String name = reader.nextLine(); // nimi muutuja
            int nameCheck = name.length();
            if (nameCheck > 3) {
                for (int i = 0; i < 3; i++) {
                    System.out.println((i + 1) + ". character is " + name.charAt(i));
                }
            }            
        }
    }
}
