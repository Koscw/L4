package Hw4.Tax;

public class IndustrialProperty extends Tax {
    public IndustrialProperty(int taxK, int S) {
        super(taxK,S);
    }

    @Override
    public double taxWorth() {
        super.taxWorth();
        return 0;
    }
}
