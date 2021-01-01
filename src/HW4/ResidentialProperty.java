package HW4;

public class ResidentialProperty extends Tax {
    int subsidies;

    public ResidentialProperty(int taxK, int S, int subsidies) {
        this.taxK = taxK;
        this.S = S;
        this.subsidies = subsidies;
    }

    public void taxWorth() {
        System.out.println("Tax: " + ((taxK * S) - (taxK * S * (0.01 * subsidies))));
    }
}
