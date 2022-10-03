package nadal_8.harjutuse_klassid;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stock;
    

    //constructor
    public Storehouse() {
        products = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }

    //Methods
    public void addProduct(String product, int price, int stock){
       this.products.put(product, price);
       this.stock.put(product, stock);
    }
    public int price(String product){
        if(this.products.containsKey(product)){
            return this.products.get(product);
        }else return 0;
    }

    public Integer stock(String product) {
        if(this.stock.containsKey(product)){
            return this.stock.get(product);
        }else return 0;
    }

    public Boolean take(String product) {
        if(this.stock.containsKey(product)){
            if (this.stock.get(product) > 0) {
                int reducedAmount = this.stock.get(product) - 1;
                this.stock.replace(product, reducedAmount);
                return true;
            } else return false;
        }else return false;
    }

    public Set<String> products() {
        return this.products.keySet();
    }
}
