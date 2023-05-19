package Setter_injection;

public class FeaturePhone implements Mobile{
    private Simcard sc;

    public void setSc(Simcard sc) {
        this.sc = sc;
    }

    @Override
    public void getType() {
        System.out.println("MOBILE TYPE IS FEATUREPHONE");
    }

    @Override
    public void getSim() {
        sc.getCompany();
    }
}
