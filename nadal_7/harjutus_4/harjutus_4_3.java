package nadal_7.harjutus_4;

import nadal_7.harjutus_4.harjutuse_klassid.Suitcase;
import nadal_7.harjutus_4.harjutuse_klassid.Thing;

public class harjutus_4_3 { //siin on harjutused 4.2 ja 4.3
    public static void main(String[] args) {
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }
}
