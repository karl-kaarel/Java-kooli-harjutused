package nadal_4;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int resetValue;
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.resetValue = 0;
        this.initialValue = valueAtStart;
    }
    public void printValue() {
        System.out.println("value: " + this.value);
    }
    public void decrease() {
        if (this.value > 0) {
            this.value = value - 1;
        }
    }
    // and here the rest of the methods
    public void reset() {
        this.value = this.resetValue;
    }
    public void setInitial() {
        this.value = this.initialValue;
    }
}
