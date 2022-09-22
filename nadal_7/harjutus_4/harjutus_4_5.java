package nadal_7.harjutus_4;

import nadal_7.harjutus_4.harjutuse_klassid.Suitcase;
import nadal_7.harjutus_4.harjutuse_klassid.Thing;

public class harjutus_4_5 {
    public static void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        String heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
    }
}
