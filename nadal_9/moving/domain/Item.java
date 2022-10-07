package nadal_9.moving.domain;

public class Item implements Thing{
    private int itemVolume;
    private String itemName;

    //Constructor
    public Item(String itemName, int itemVolume){
        this.itemName = itemName;
        this.itemVolume = itemVolume;
    }

    //Methods
    public String getName(){
        return itemName;
    }
    public String toString(){
        String statement = this.itemName + " (" + this.itemVolume +" dm^3)";
        return statement;
    }

    @Override
    public int getVolume() {
        return this.itemVolume;
    }
}
