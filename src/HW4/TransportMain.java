package HW4;

public class TransportMain {
    public static void main(String[] args) {
        Train tgv = new Train("QR92",10000,300,50);
        tgv.printcharacteristics();
        tgv.printAmountOfContainersOnATrain();
        Plane beechcraft  = new Plane("Baron",500,800,8);
        beechcraft.printcharacteristics();
        beechcraft.printamountOfPeopleOnAPlane();
    }
}
