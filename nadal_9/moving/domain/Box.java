package nadal_9.moving.domain;

import java.util.ArrayList;

public class Box implements Thing {
    private int maxCapacity;
    private ArrayList<Thing> items;

    //Constructor
    public Box(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<Thing>();
    }

    //Methods
    public boolean addThing(Thing item){
        if(item.getVolume() <= this.maxCapacity) {
            this.items.add(item);
            this.maxCapacity -= item.getVolume();
            return true;
        }
        return false;
    }
    @Override
    public int getVolume(){
        int thingsCapasity = 0;
        for (Thing thing:this.items) {
            thingsCapasity += thing.getVolume();
        }
        return thingsCapasity;
    }
    @Override
    public String toString(){
        String content = "";
        for (Thing thing:this.items) {
            content += "\t" + thing.toString() + "\n";
        }
        return content;
    }
}
