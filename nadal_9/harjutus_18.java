package nadal_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nadal_9.moving.domain.*;

public class harjutus_18 {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));
        items.add(new Item("angular saw", 3));
    
        Collections.sort(items);
        System.out.println(items);
    }
}