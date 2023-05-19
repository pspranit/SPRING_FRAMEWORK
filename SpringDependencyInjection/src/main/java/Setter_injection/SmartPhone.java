package Setter_injection;

public class SmartPhone implements Mobile{
    private Simcard sc;

    public void setSc(Simcard sc) {
        this.sc = sc;
    }

    @Override
    public void getType() {
        System.out.println("MOBILE TYPE IS SMARTPHONE");
    }

    @Override
    public void getSim() {
     sc.getCompany();
    }
}
