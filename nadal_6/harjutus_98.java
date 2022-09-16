package nadal_6;
import java.util.Arrays;

public class harjutus_98 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }

    private static int[] copy(int[] original) {
        int[] newArray = original.clone();
        return newArray;
    }
}
