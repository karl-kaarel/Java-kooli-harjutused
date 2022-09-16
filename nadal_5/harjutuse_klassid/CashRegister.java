package nadal_5.harjutuse_klassid;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    private double gourmetPrice;
    private double economicalPrice;

    public CashRegister() {
        this.cashInRegister = 1000.0;
        this.gourmetPrice = 4.00;
        this.economicalPrice = 2.50;
    }

    public double payEconomical(double cashGiven) { //payment with cash
        if (economicalPrice <= cashGiven) {
            this.cashInRegister = this.cashInRegister + economicalPrice;
            this.economicalSold = this.economicalSold + 1;
            return cashGiven - economicalPrice;
        }else return cashGiven;
    }

    public double payGourmet(double cashGiven) { //payment with cash
        if (gourmetPrice <= cashGiven) {
            this.cashInRegister = this.cashInRegister + gourmetPrice;
            this.gourmetSold = this.gourmetSold + 1;
            return cashGiven - gourmetPrice;
        }else return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) { //payment with card
        double balance = card.balance();
        if (economicalPrice <= balance) {
            this.economicalSold = this.economicalSold + 1;
            card.pay(economicalPrice);
            return true;
        }else return false;
    }

    public boolean payGourmet(LyyraCard card) { // payment with card
        double balance = card.balance();
        if (gourmetPrice <= balance) {
            this.gourmetSold = this.gourmetSold + 1;
            card.pay(gourmetPrice);
            return true;
        }else return false;
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        double loadAmount = sum;
        card.loadMoney(loadAmount);
        this.cashInRegister = this.cashInRegister + loadAmount;
    }
}
