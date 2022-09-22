package nadal_7.harjutus_4;

import nadal_7.harjutus_4.harjutuse_klassid.Container;
import nadal_7.harjutus_4.harjutuse_klassid.Suitcase;
import nadal_7.harjutus_4.harjutuse_klassid.Thing;

public class harjutus_4_8 {
    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        
        int newWeight = 1;
        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("Brick", newWeight);
            Suitcase mySuitcase = new Suitcase((newWeight));
            mySuitcase.addThing(brick);
            container.addSuitcase(mySuitcase);

            newWeight = newWeight + 1;
        }
    }
}
