package Hw4.Tax;

import java.util.List;

public class TaxMain {
    public static void main(String[] args) {
        Tax residential=new ResidentialProperty(5,75,7);
        System.out.println(residential.taxWorth());
        Tax retail = new RetailProperty(2,120,10000);
        System.out.println(retail.taxWorth());
        Tax industrial=new IndustrialProperty(2,80);
        System.out.println(industrial.taxWorth());

    }
}
