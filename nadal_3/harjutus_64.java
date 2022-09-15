package nadal_3;
import java.util.ArrayList;

public class harjutus_64 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

    public static double average(ArrayList<Integer> numbrid) {
        int ArrayLength = numbrid.size();// numbrite kogus array listis
        double keskmine = 0;
        
        for (double number : numbrid) {// loop liidab listis olevad numbrid kokku
            keskmine = keskmine + number;
        }
        keskmine = keskmine / ArrayLength; // kokku liidetud numbrid jagatakse array listi numbrite kogusega

        return keskmine;
    }    
}
