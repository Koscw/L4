package HW4;

public class TaxMain {
    public static void main(String[] args) {
        Tax residential=new ResidentialProperty(5,75,7);
        residential.taxWorth();
        Tax retail = new RetailProperty(2,120,10000);
        retail.taxWorth();
        Tax industrial=new IndustrialProperty(2,80);
        industrial.taxWorth();

    }
}
