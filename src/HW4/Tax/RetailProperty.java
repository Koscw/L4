package Hw4.Tax;

public class RetailProperty extends Tax {
    int earnings;

    public RetailProperty(int taxK, int S, int earnings) {
        this.taxK = taxK;
        this.S = S;
        this.earnings = earnings;
    }

    public int taxWorth() {
        if (earnings < 100) {
            System.out.println("No tax included");
        } else {
            System.out.println("Tax: " + taxK * S);
        }
        return 0;
    }

}
