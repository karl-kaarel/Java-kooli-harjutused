package nadal_2;

public class harjutus_44 {
    public static void main(String[] args) {
        int answer =  Least(7, 2);
        System.out.println("Least: " + answer);
    }

    private static int Least(int num1, int num2) { //Method
        int minNum = Math.min(num1, num2);
        return minNum;
    }
}