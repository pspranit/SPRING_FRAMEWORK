package demo;

public class Projector implements Machine{
    @Override
    public void getType() {
        System.out.println("MACHINE TYPE IS PROJECTOR");
    }

    @Override
    public void getPrice() {
        System.out.println("MACHINE PRICE IS 50000.00");
    }
}
