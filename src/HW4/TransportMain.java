package HW4;

public class TransportMain {
    public static void main(String[] args) {
        Train TGV = new Train("QR92",10000,300,50);
        TGV.characteristics();
        TGV.setAmountOfContainersOnATrain();
        Plane Beechcraft  = new Plane("Baron",500,800,8);
        Beechcraft.characteristics();
        Beechcraft.amountOfPeopleOnAPlane();
    }
}
