package nadal_5.harjutuse_klassid;

public class Counter {
    private int value;

    //constructor
    public Counter(int startValue, boolean check) {
        if (check == true) {
            this.value = startValue;
        }else this.value = 0;
    }

    //methods
    public int value() {
        return this.value;
    }
    public void increase(int amount) {
        this.value = value + amount;
    }
    public void decrease(int amount) {
        if (this.value > 0) {
            this.value = value - amount;
        }
    }
}
