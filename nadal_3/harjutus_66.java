package nadal_3;
import java.util.ArrayList;
import java.util.Collections;

public class harjutus_66 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3);
            list.add(2);
            list.add(7);
            list.add(2);

            System.out.println("The greatest number is: " + greatest(list));
    }

    public static Integer greatest(ArrayList<Integer> numbrid) {
        int greatest = Collections.max(numbrid);
        return greatest;
    }  
}
