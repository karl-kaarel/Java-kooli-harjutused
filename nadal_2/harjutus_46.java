package nadal_2;
import java.util.Scanner;

public class harjutus_46 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Your name: ");
            String name = reader.nextLine(); // nimi muutuja

            char lastChar = name.charAt((name.length() - 1)); // nimi muutuja tähe leidmine
            System.out.print("Last character is " + lastChar);
        }
    }
}
