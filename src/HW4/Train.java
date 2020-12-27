package HW4;

public class Train extends Transport {
    private final int amountOfContainers;
    public Train(String model, int weight, int maxspeed,int amountOfContainers) {
        super(model, weight, maxspeed);
        this.amountOfContainers=amountOfContainers;
    }

    public void setAmountOfContainersOnATrain(){
        System.out.println("The train has : "+amountOfContainers+" containers");
    }
}
