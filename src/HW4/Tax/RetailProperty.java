package Hw4.Tax;

public class RetailProperty extends Tax {
    int earnings;

    public RetailProperty(int taxK, int S, int earnings) {
        super(taxK, S);
        this.earnings = earnings;
    }

    @Override
    public double taxWorth() {
        if (earnings < 100) {
           return 0;
        } else {
            return super.taxWorth();
        }

    }

}
