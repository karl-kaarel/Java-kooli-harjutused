package nadal_7.harjutus_4.harjutuse_klassid;

public class Thing {
    private int weight;
    private String name;

    //constructor
    public Thing(String object, int weight) {
        this.name = object;
        this.weight = weight;
    }

    //methods
    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }
    public String toString() {
        String statement = this.name + " ("+this.weight+" kg)";
        return statement;
    }
}
