package Hw4.Tax;

public class Tax {
    double taxK;
    double S;

    public Tax(int taxK,int S){
        this.taxK=taxK;
        this.S=S;
        System.out.println("Tax coefficient :" + taxK);
        System.out.println("S= "+S);
    }
    public double taxWorth() {
        double l=taxK*S;
        return l;

    }

}
