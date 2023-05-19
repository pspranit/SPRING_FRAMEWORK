package BothInjection;

public class Acer implements Laptop{

    private GraphicCard gcard;

    public void setGcard(GraphicCard gcard) {
        this.gcard = gcard;
    }

    void Acer()
    {

    }

    Ram ram;

    public Acer(Ram ram)
    {
        this.ram=ram;
    }

    @Override
    public void getType() {

        System.out.println("LAPTOP TYPE IS ACER");
    }

    @Override
    public void getLaptopInfo() {
        ram.getType();
    }
}
