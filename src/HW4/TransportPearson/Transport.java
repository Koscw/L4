package Hw4.TransportPearson;

public class Transport {
    private String model;
    private int weight;
    private int maxspeed;

    public Transport(String model, int weight, int maxspeed) {
        this.model = model;
        this.weight = weight;
        this.maxspeed = maxspeed;
    }

    public void printcharacteristics() {
        System.out.println("Characteristics of a transport: Model: " + model + " Weight " + weight + " Maxspeed " + maxspeed);
    }
}

