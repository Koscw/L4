package HW4;

public class Transport {
    private String model;
    private int weight;
    private int maxspeed;

    public Transport(String model, int weight, int maxspeed) {
        this.model = model;
        this.weight = weight;
        this.maxspeed = maxspeed;
    }

    public void characteristics() {
        System.out.println("Characteristics of a transport: Model: " + model + " Weight " + weight + " Maxspeed " + maxspeed);
    }
}

