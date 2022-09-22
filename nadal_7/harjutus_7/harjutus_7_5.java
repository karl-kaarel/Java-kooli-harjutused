package nadal_7.harjutus_7;

import java.util.Scanner;
import nadal_7.harjutus_7.harjutuse_klassid.Dictionary;
import nadal_7.harjutus_7.harjutuse_klassid.TextUserInterface;

public class harjutus_7_5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();
    
        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();         
    }
}
