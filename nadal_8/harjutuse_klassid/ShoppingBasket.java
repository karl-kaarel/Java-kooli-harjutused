package nadal_8.harjutuse_klassid;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    private List<Purchase> purchases;

    //constructor
    public ShoppingBasket() {
        purchases = new ArrayList<Purchase>();
    }

    //methods
    public void add(String product, int price){
        this.purchases.add(new Purchase(product, 1, price));
    }

    public int price(){
        int price = 0;
        for (Purchase purchase: this.purchases) {
            price += purchase.price();
        }
        return price;
    }
    public void print(){
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }
    }
}
