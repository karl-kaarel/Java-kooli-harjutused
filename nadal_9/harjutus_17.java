package nadal_9;

import nadal_9.mooc.TextUserInterface;
import nadal_9.mooc.logic.ApplicationLogic;
import nadal_9.mooc.ui.UserInterface;

public class harjutus_17 {
    public static class Main {
        public static void main(String[] args) {
            UserInterface ui = new TextUserInterface();
            new ApplicationLogic(ui).execute(3);
        }
    }        
}
