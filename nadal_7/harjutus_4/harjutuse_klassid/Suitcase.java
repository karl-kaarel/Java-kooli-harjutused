package nadal_7.harjutus_4.harjutuse_klassid;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private int suitcase;
    private int suitcaseCheck;
    ArrayList<Thing> items = new ArrayList<Thing>();

    //constructor
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcase = 0;
        this.suitcaseCheck = 0;
    }

    //methods
    public void addThing(Thing thing) {
        this.suitcaseCheck = this.suitcaseCheck + thing.getWeight();
        if (this.maxWeight >= this.suitcaseCheck) {
            items.add(thing);
            this.suitcase = this.suitcase + thing.getWeight();
        }
    }
    public void printThings() {
        for (Thing item : items) {
            System.out.println(item.toString());
        }
    }
    public int totalWeight() {
        return suitcase;
    }
    public String heaviestThing() {
        int maxNum = 0;
        String statement = "";
        for (Thing maxItem : items) {
            if (maxItem.getWeight() > maxNum) {
                statement = maxItem.toString();
            }
        }
        return statement;
    }
    public String toString() {
        String suitcaseItemsAmount;
        if (items.size() >= 1) {
            if (items.size() == 1) {
                suitcaseItemsAmount = items.size()+" thing";
            }else suitcaseItemsAmount = items.size()+" things";
        }else suitcaseItemsAmount = "empty";

        String statement = suitcaseItemsAmount+" ("+suitcase+" kg"+")";
        return statement;
    }
}
