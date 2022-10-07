package nadal_9.moving.domain;

public class Item implements Thing, Comparable<Item>{
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

    @Override
    public int compareTo(Item itemList) {
        if(this.itemVolume == itemList.getVolume()){
            return 0;
        } else if(this.itemVolume > itemList.getVolume()){
            return 1;
        } else return -1;
    }
}
