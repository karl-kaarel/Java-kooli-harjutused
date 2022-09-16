package nadal_5;

import nadal_5.harjutuse_klassid.Counter;

public class harjutus_84 {
    public static void main(String[] args) {
        Counter counter = new Counter(100, true);

        System.out.println("value: " + counter.value());

        counter.decrease(2);
        counter.decrease(5);
        counter.decrease(10);
        counter.increase(3);

        System.out.println("value: " + counter.value());        
    }
}
