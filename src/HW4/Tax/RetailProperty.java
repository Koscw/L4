package Hw4.Tax;

public class RetailProperty extends Tax {
    int earnings;

    public RetailProperty(int taxK, int S, int earnings) {
        super(taxK, S);
        this.earnings = earnings;
    }

    public double taxWorth() {
        if (earnings < 100) {
            System.out.println("No tax included");
            return 0;


        } else {
            double q = super.taxWorth();
            return q;
        }

    }

}
