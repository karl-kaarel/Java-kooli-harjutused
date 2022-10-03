package nadal_8.harjutuse_klassid;

public class Purchase {
    private String productName;
    private int amount;
    private int price;

    //constructor
    public Purchase(String name, int amount, int price) {
        this.productName = name;
        this.amount = amount;
        this.price = price;
    }

    //methods
    public void increaseAmount() {
        this.amount = this.amount + 1;
    }
    public int price() {
        return this.price * this.amount;
    }
    public String toString() {
        return this.productName + ": " +this.amount;
    }
}
