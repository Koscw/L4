package Hw4.TransportPearson;

public class Plane extends Transport {
    private final int amountOfPeople;

    public Plane(String model, int weight, int maxspeed,int amountOfPeople) {
        super(model, weight, maxspeed);
        this.amountOfPeople=amountOfPeople;
    }
    public void printamountOfPeopleOnAPlane(){
        System.out.println("Amount of people on a plane:"+amountOfPeople);
    }
}
