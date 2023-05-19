package BothInjection;

public class HP implements Laptop{

    private GraphicCard gcard;

    public void setGcard(GraphicCard gcard) {
        this.gcard = gcard;
    }

    public HP()
    {

    }

    Ram ram;

    public HP(Ram ram)
    {
        this.ram=ram;
    }
    @Override
    public void getType() {
        System.out.println("LAPTOP TYPE IS HP");
    }

    @Override
    public void getLaptopInfo() {
        ram.getType();
    }
}
