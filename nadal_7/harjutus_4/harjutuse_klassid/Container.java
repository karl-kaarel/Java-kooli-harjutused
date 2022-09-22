package nadal_7.harjutus_4.harjutuse_klassid;

import java.util.ArrayList;

public class Container {
    ArrayList<Suitcase> containerItems = new ArrayList<Suitcase>();
    private int maxWeight;
    private int containerCheck;
    private int containerWeight;
    
    //constructor
    public Container(int MaxWeight) {
        this.maxWeight = MaxWeight;
        this.containerCheck = 0;
        this.containerWeight = 0;
    }

    //methods
    public void addSuitcase(Suitcase suitcase) {
        this.containerCheck = this.containerCheck + suitcase.totalWeight();
        if (this.maxWeight >= this.containerCheck) {
            containerItems.add(suitcase);
            this.containerWeight = this.containerWeight + suitcase.totalWeight();
        }
    }
    public void printThings() {
        for (Suitcase suitcaseItem : containerItems) {
            suitcaseItem.printThings();
        }
    }
    public String toString() {
        String containerItemsAmount;
        if (containerItems.size() >= 1) {
            if (containerItems.size() == 1) {
                containerItemsAmount = containerItems.size()+" suitcase";
            }else containerItemsAmount = containerItems.size()+" suitcases";
        }else containerItemsAmount = "empty";

        String statement = containerItemsAmount+" ("+containerWeight+" kg"+")";
        return statement;
    }
}
