import java.util.Scanner;

public class harjutus_9 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Type a number: ");
            double num1 = Integer.parseInt(reader.nextLine());

            System.out.print("Type another number: ");
            double num2 = Integer.parseInt(reader.nextLine());


            System.out.println("Division: " + num1 + "/" + num2 + "=" + num1/num2);
        }
    }
}
