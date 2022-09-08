package nadal_2;
import java.util.Scanner;

public class harjutus_26 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            int sum = 0;
            while (true) {
                System.out.print("Type a number: ");
                int read = Integer.parseInt(reader.nextLine());
                if (read == 0) {
                    break;
                }

                // DO SOMETHING HERE
                sum = sum + read;

                System.out.println("Sum now: " + sum);
            }

            System.out.println("Sum in the end: " + sum);
        }  
    }
}
