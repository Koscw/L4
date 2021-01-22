package Hw4.Tax;

public class IndustrialProperty extends Tax {
    public IndustrialProperty(int taxK, int S) {
        this.taxK = taxK;
        this.S = S;
    }

    @Override
    public int taxWorth() {
        super.taxWorth();
        return 0;
    }
}
