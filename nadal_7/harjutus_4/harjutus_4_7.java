package nadal_7.harjutus_4;

import nadal_7.harjutus_4.harjutuse_klassid.Container;
import nadal_7.harjutus_4.harjutuse_klassid.Suitcase;
import nadal_7.harjutus_4.harjutuse_klassid.Thing;

public class harjutus_4_7 {
    public static void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println("There are the following things in the container suitcases:");
        container.printThings();
    }
}
