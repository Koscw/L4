package Hw4.Tax;

public class ResidentialProperty extends Tax {
    int subsidies;

    public ResidentialProperty(int taxK, int S, int subsidies) {
        super(taxK,S);
        this.subsidies=subsidies;
    }
    @Override
    public double taxWorth() {

        double q = super.taxWorth()-(taxK * S * 0.01 * subsidies);
        return (int) q;
    }
}
