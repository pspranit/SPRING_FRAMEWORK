package Constructor_Injection;

public class DieselCar implements Car{

    DieselEngine engine;

    public DieselCar(DieselEngine engine) {
        this.engine = engine;
    }

    @Override
    public void getType() {
        System.out.println("CAR TYPE IS DIESEL CAR");
    }

    @Override
    public void getEngineInfo() {
         engine.getType();
    }
}
