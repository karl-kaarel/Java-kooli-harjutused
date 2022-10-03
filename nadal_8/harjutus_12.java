package nadal_8;

import nadal_8.harjutuse_klassid.ShoppingBasket;

public class harjutus_12 {
    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("basket price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("basket price: " + basket.price());
    }
}
