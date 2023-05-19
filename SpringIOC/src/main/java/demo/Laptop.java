package demo;

public class Laptop implements Machine {

    @Override
    public void getType() {
        System.out.println("MACHINE TYPE IS LAPTOP");
    }

    @Override
    public void getPrice() {
        System.out.println("MACHINE PRICE IS 45000.00");
    }
}
